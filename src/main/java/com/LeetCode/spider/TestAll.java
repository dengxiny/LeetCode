package com.LeetCode.spider;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import com.LeetCode.spider.detail.DetailTest;
import com.alibaba.fastjson.JSONObject;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TestAll {
	public static void main(String[] args) throws Exception {
		;
		getAllTransQuestion(getAllQuestion());
		
	}
	public static void  getAllTransQuestion(QuestionBean qa) throws Exception{
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create("{\"operationName\":\"getQuestionTranslation\",\"variables\":{},\"query\":\"query getQuestionTranslation($lang: String) {\\n  translations: allAppliedQuestionTranslations(lang: $lang) {\\n    title\\n    questionId\\n    __typename\\n  }\\n}\\n\"}", mediaType);
		//RequestBody body = RequestBody.create(mediaType, "{\"operationName\":\"getQuestionTranslation\",\"variables\":{},\"query\":\"query getQuestionTranslation($lang: String) {\\n  translations: allAppliedQuestionTranslations(lang: $lang) {\\n    title\\n    questionId\\n    __typename\\n  }\\n}\\n\"}");
		Request request = new Request.Builder()
		  .url("https://leetcode-cn.com/graphql")
		  .post(body)
		  .addHeader("accept", "*/*")
		  //.addHeader("accept-encoding", "gzip, deflate, br")
		  .addHeader("accept-language", "utf-8")
		  .addHeader("cache-control", "no-cache,no-cache")
		  .addHeader("Content-Type", "application/json")
		  .addHeader("cookie", "csrftoken=lbEHxFIJQbbBZCWEosZUYuZRXGfoymwoJdV9XIpRzFggbpJAtMDvB1eV3aj4Wk8Q; Hm_lvt_fa218a3ff7179639febdb15e372f411c=1569227020; Hm_lpvt_fa218a3ff7179639febdb15e372f411c=1569227020, csrftoken=lbEHxFIJQbbBZCWEosZUYuZRXGfoymwoJdV9XIpRzFggbpJAtMDvB1eV3aj4Wk8Q; Hm_lvt_fa218a3ff7179639febdb15e372f411c=1569227020; Hm_lpvt_fa218a3ff7179639febdb15e372f411c=1569227020; csrftoken=lbEHxFIJQbbBZCWEosZUYuZRXGfoymwoJdV9XIpRzFggbpJAtMDvB1eV3aj4Wk8Q")
		  .addHeader("origin", "https://leetcode-cn.com")
		  .addHeader("pragma", "no-cache")
		  .addHeader("referer", "https://leetcode-cn.com/problemset/algorithms/")
		  .addHeader("user-agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.92 Safari/537.36")
		  .addHeader("x-csrftoken", "lbEHxFIJQbbBZCWEosZUYuZRXGfoymwoJdV9XIpRzFggbpJAtMDvB1eV3aj4Wk8Q")
		  .addHeader("Host", "leetcode-cn.com")
		  //.addHeader("Content-Length", "229")
		  .addHeader("Connection", "close")
		  .build();

		Response response = client.newCall(request).execute();
		QuestionTransBean q = JSONObject.parseObject(response.body().string(), QuestionTransBean.class);
		System.out.println(JSONObject.toJSONString(q));
		for (Translations t: q.getData().getTranslations()) {
			//t.setTitle(decodeUnicode(t.getTitle()));
			//t.set__typename(decodeUnicode(t.get__typename()));
			for (Stat_status_pairs stat_status_pairs : qa.getStat_status_pairs()) {
				if( String.valueOf(stat_status_pairs.getStat().getQuestion_id()).equals(t.getQuestionId())) {
					stat_status_pairs.getStat().setTitle(t.getTitle());
					stat_status_pairs.getStat().set__typename(t.get__typename());
				}
			}
		}
		DetailTest detailTest = new DetailTest();
		for (Stat_status_pairs stat_status_pairs : qa.getStat_status_pairs()) {
			try {
				//System.out.println(JSONObject.toJSONString(stat_status_pairs));
				detailTest.getDetail(stat_status_pairs.getStat().getQuestion__title_slug());
			} catch (Exception e) {
				System.err.println(stat_status_pairs.getStat().getQuestion__title_slug());
			}
		}
		//System.err.println(response.body().string());
	}
	
	public static QuestionBean  getAllQuestion() throws Exception{
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url("https://leetcode-cn.com/api/problems/algorithms/")
		  .get()
		  .addHeader("User-Agent", "PostmanRuntime/7.17.1")
		  .addHeader("Accept", "*/*")
		  .addHeader("Cache-Control", "no-cache")
		  .addHeader("Host", "leetcode-cn.com")
		  //.addHeader("Accept-Encoding", "gzip, deflate")
		  .addHeader("Cookie", "csrftoken=lbEHxFIJQbbBZCWEosZUYuZRXGfoymwoJdV9XIpRzFggbpJAtMDvB1eV3aj4Wk8Q")
		  .addHeader("Connection", "keep-alive")
		  .addHeader("cache-control", "no-cache")
		  .build();

		Response response = client.newCall(request).execute();
		//System.out.println(response.body().string());
		QuestionBean q = JSONObject.parseObject(response.body().string(), QuestionBean.class);
		//System.out.println(JSONObject.toJSONString(q));
		List<Stat_status_pairs> list = q.getStat_status_pairs();
		/*for (Stat_status_pairs stat_status_pairs : list) {
			System.out.println(JSONObject.toJSONString(stat_status_pairs));
		}*/
		return q;
	}
	
	//Unicode转中文
    public static String decodeUnicode(final String dataStr) {   
        int start = 0;   
        int end = 0;   
        final StringBuffer buffer = new StringBuffer();   
        while (start > -1) {   
            end = dataStr.indexOf("\\u", start + 2);   
            String charStr = "";   
            if (end == -1) {   
                charStr = dataStr.substring(start + 2, dataStr.length());   
            } else {   
                charStr = dataStr.substring(start + 2, end);   
            }   
            char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。   
            buffer.append(new Character(letter).toString());   
            start = end;   
        }   
        return buffer.toString();   
    }
    
}
