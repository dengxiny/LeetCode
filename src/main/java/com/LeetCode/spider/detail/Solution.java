package com.LeetCode.spider.detail;
public class Solution
{
    private String id;

    private boolean canSeeDetail;

    private String __typename;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setCanSeeDetail(boolean canSeeDetail){
        this.canSeeDetail = canSeeDetail;
    }
    public boolean getCanSeeDetail(){
        return this.canSeeDetail;
    }
    public void set__typename(String __typename){
        this.__typename = __typename;
    }
    public String get__typename(){
        return this.__typename;
    }
}