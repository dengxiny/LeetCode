package com.LeetCode.freemark;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreemarkerDemo {
    
    private static final String TEMPLATE_PATH = "src/main/resources";
    //C:/Users/dengxy/eclipse-workspace/LeetCode/
    private static final String CLASS_PATH = "src/main/java/com/LeetCode/code";
    
   /* public static void main(String[] args) {
        // step1 创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        try {
            // step2 获取模版路径
            configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
            // step3 创建数据模型
            Map<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("classPath", "com.freemark.hello");
            dataMap.put("className", "User");
            dataMap.put("Id", "Id");
            dataMap.put("userName", "userName");
            dataMap.put("password","password");
            // step4 加载模版文件
            Template template = configuration.getTemplate("question.ftl");
            // step5 生成数据
            File docFile = new File(CLASS_PATH + "\\" + "Solution.java");
            if(!docFile.exists()) {
            	docFile.createNewFile();
            }
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
            // step6 输出文件
            template.process(dataMap, out);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^Solution.java 文件创建成功 !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }*/
    
    public static void create(Map<String, String> dataMap) {
    	   // step1 创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        try {
            // step2 获取模版路径
            configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
            String packageQuest = "q" + dataMap.get("QuestionId");
            String packageQuestName = dataMap.get("Title").replace(" ", "");
            // step3 创建数据模型
            dataMap.put("packageName","com.LeetCode.code."+packageQuest+"."+packageQuestName);
            // step4 加载模版文件
            Template template = configuration.getTemplate("question.ftl");
            // step5 生成数据
            String path  = CLASS_PATH +"/"+packageQuest+"/"+packageQuestName;
            String path2 = path	+ "/" + "Solution.java" ;
            System.out.println(path);
            File dir = new File(path);
            if(!dir.exists()) {
            	dir.mkdirs();
            }
            File docFile = new File(path2);
            if(!docFile.exists()) {
            	docFile.createNewFile();
            }
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
            // step6 输出文件
            template.process(dataMap, out);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^Solution.java 文件创建成功 !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}