package com.LeetCode.spider.detail;
public class TopicTags
{
    private String name;

    private String slug;

    private String translatedName;

    private String __typename;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSlug(String slug){
        this.slug = slug;
    }
    public String getSlug(){
        return this.slug;
    }
    public void setTranslatedName(String translatedName){
        this.translatedName = translatedName;
    }
    public String getTranslatedName(){
        return this.translatedName;
    }
    public void set__typename(String __typename){
        this.__typename = __typename;
    }
    public String get__typename(){
        return this.__typename;
    }
}

