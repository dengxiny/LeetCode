package com.LeetCode.spider.detail;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.LeetCode.freemark.FreemarkerDemo;
import com.LeetCode.spider.QuestionTransBean;
import com.alibaba.fastjson.JSONObject;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class DetailTest {
	public static void main(String[] args) throws Exception {
		getDetail("longest-substring-without-repeating-characters");
	}
	
	
	public static void getDetail(String titleSlug) throws Exception{
		OkHttpClient client = new OkHttpClient();
		MediaType mediaType = MediaType.parse("application/json");
		String s = String.format("{\"operationName\":\"questionData\",\"variables\":{\"titleSlug\":\"%s\"},\"query\":\"query questionData($titleSlug: String!) {\\n  question(titleSlug: $titleSlug) {\\n    questionId\\n    questionFrontendId\\n    boundTopicId\\n    title\\n    titleSlug\\n    content\\n    translatedTitle\\n    translatedContent\\n    isPaidOnly\\n    difficulty\\n    likes\\n    dislikes\\n    isLiked\\n    similarQuestions\\n    contributors {\\n      username\\n      profileUrl\\n      avatarUrl\\n      __typename\\n    }\\n    langToValidPlayground\\n    topicTags {\\n      name\\n      slug\\n      translatedName\\n      __typename\\n    }\\n    companyTagStats\\n    codeSnippets {\\n      lang\\n      langSlug\\n      code\\n      __typename\\n    }\\n    stats\\n    hints\\n    solution {\\n      id\\n      canSeeDetail\\n      __typename\\n    }\\n    status\\n    sampleTestCase\\n    metaData\\n    judgerAvailable\\n    judgeType\\n    mysqlSchemas\\n    enableRunCode\\n    enableTestMode\\n    envInfo\\n    __typename\\n  }\\n}\\n\"}", titleSlug);
		RequestBody body = RequestBody.create(mediaType, s);
		Request request = new Request.Builder()
		  .url("https://leetcode-cn.com/graphql")
		  .post(body)
		  .addHeader("accept", "*/*")
		  .addHeader("accept-language", "zh-CN,zh;q=0.9")
		  .addHeader("cache-control", "no-cache,no-cache")
		  .addHeader("Content-Type", "application/json")
		  .addHeader("cookie", "csrftoken=lbEHxFIJQbbBZCWEosZUYuZRXGfoymwoJdV9XIpRzFggbpJAtMDvB1eV3aj4Wk8Q; Hm_lvt_fa218a3ff7179639febdb15e372f411c=1569227020; Hm_lpvt_fa218a3ff7179639febdb15e372f411c=1569227020; gr_user_id=7839de9f-1326-4ba7-8573-4b13880d8709; __auc=6d25cfa616d5d382561a4e4bdd0; grwng_uid=91810290-83e3-4beb-a82f-98f40041742c; a2873925c34ecbd2_gr_session_id=5bac020b-163c-4d1d-9b8f-8dee018f6c05; a2873925c34ecbd2_gr_session_id_5bac020b-163c-4d1d-9b8f-8dee018f6c05=true, csrftoken=lbEHxFIJQbbBZCWEosZUYuZRXGfoymwoJdV9XIpRzFggbpJAtMDvB1eV3aj4Wk8Q; Hm_lvt_fa218a3ff7179639febdb15e372f411c=1569227020; Hm_lpvt_fa218a3ff7179639febdb15e372f411c=1569227020; gr_user_id=7839de9f-1326-4ba7-8573-4b13880d8709; __auc=6d25cfa616d5d382561a4e4bdd0; grwng_uid=91810290-83e3-4beb-a82f-98f40041742c; a2873925c34ecbd2_gr_session_id=5bac020b-163c-4d1d-9b8f-8dee018f6c05; a2873925c34ecbd2_gr_session_id_5bac020b-163c-4d1d-9b8f-8dee018f6c05=true; csrftoken=lbEHxFIJQbbBZCWEosZUYuZRXGfoymwoJdV9XIpRzFggbpJAtMDvB1eV3aj4Wk8Q")
		  .addHeader("origin", "https://leetcode-cn.com")
		  .addHeader("pragma", "no-cache")
		  .addHeader("referer", "https://leetcode-cn.com/problems/")
		  .addHeader("user-agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.92 Safari/537.36")
		  .addHeader("x-csrftoken", "lbEHxFIJQbbBZCWEosZUYuZRXGfoymwoJdV9XIpRzFggbpJAtMDvB1eV3aj4Wk8Q")
		  .addHeader("Host", "leetcode-cn.com")
		  .addHeader("Connection", "keep-alive")
		  .build();
		Response response = client.newCall(request).execute();
		//System.out.println(response.body().string());
		String code = "";
		QuestionDetail q = JSONObject.parseObject(response.body().string(), QuestionDetail.class);
		for(CodeSnippets  codeSnippets: q.getData().getQuestion().getCodeSnippets()) {
			if(codeSnippets.getLang().equals("Java")) {
				System.out.println(codeSnippets.getCode());
				code = codeSnippets.getCode();
			}
		}
		System.out.println(q.getData().getQuestion().getTranslatedTitle());
		System.out.println(q.getData().getQuestion().getTranslatedContent());;
		Question question = q.getData().getQuestion();
		String QuestionId = question.getQuestionId();
		String Title = question.getTitle();
		String TranslatedTitle = question.getTranslatedTitle();
		String TranslatedContent = question.getTranslatedContent();
		if(null == TranslatedContent) {
			
		}else{
		TranslatedContent = question.getTranslatedContent().replace("&quot;", "\"").replace("&nbsp;", " ").replace("&lt;", "<").replace("&gt;", ">").replace("&ldquo;","“").replace("&rdquo;", "”")
				.replaceAll("<\\w+>", "").replaceAll("</\\w+>", "").replaceAll("\\n", "\n\t").replace("&#39;", ".");
		}
		String difficulty = question.getDifficulty();
		titleSlug = question.getTitleSlug();
		Map<String, String> dataMap = new HashMap<String, String>();
		dataMap.put("QuestionId", QuestionId);
		dataMap.put("code", code);
		dataMap.put("Title", Title);
		dataMap.put("TranslatedTitle", TranslatedTitle);
		dataMap.put("TranslatedContent", TranslatedContent);
		dataMap.put("difficulty", difficulty);
		dataMap.put("titleSlug", titleSlug);
		new FreemarkerDemo().create(dataMap);
	}
}
