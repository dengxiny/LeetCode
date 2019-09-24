package com.LeetCode.spider.detail;
public class CodeSnippets
{
    private String lang;

    private String langSlug;

    private String code;

    private String __typename;

    public void setLang(String lang){
        this.lang = lang;
    }
    public String getLang(){
        return this.lang;
    }
    public void setLangSlug(String langSlug){
        this.langSlug = langSlug;
    }
    public String getLangSlug(){
        return this.langSlug;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public void set__typename(String __typename){
        this.__typename = __typename;
    }
    public String get__typename(){
        return this.__typename;
    }
}