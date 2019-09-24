package com.LeetCode.spider.detail;
import java.util.ArrayList;

import java.util.List;
public class Question
{
    private String questionId;

    private String questionFrontendId;

    private int boundTopicId;

    private String title;

    private String titleSlug;

    private String content;

    private String translatedTitle;

    private String translatedContent;

    private boolean isPaidOnly;

    private String difficulty;

    private int likes;

    private int dislikes;

    private String isLiked;

    private String similarQuestions;

    private List<String> contributors;

    private String langToValidPlayground;

    private List<TopicTags> topicTags;

    private String companyTagStats;

    private List<CodeSnippets> codeSnippets;

    private String stats;

    private List<String> hints;

    private Solution solution;

    private String status;

    private String sampleTestCase;

    private String metaData;

    private boolean judgerAvailable;

    private String judgeType;

    private List<String> mysqlSchemas;

    private boolean enableRunCode;

    private boolean enableTestMode;

    private String envInfo;

    private String __typename;

    public void setQuestionId(String questionId){
        this.questionId = questionId;
    }
    public String getQuestionId(){
        return this.questionId;
    }
    public void setQuestionFrontendId(String questionFrontendId){
        this.questionFrontendId = questionFrontendId;
    }
    public String getQuestionFrontendId(){
        return this.questionFrontendId;
    }
    public void setBoundTopicId(int boundTopicId){
        this.boundTopicId = boundTopicId;
    }
    public int getBoundTopicId(){
        return this.boundTopicId;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitleSlug(String titleSlug){
        this.titleSlug = titleSlug;
    }
    public String getTitleSlug(){
        return this.titleSlug;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return this.content;
    }
    public void setTranslatedTitle(String translatedTitle){
        this.translatedTitle = translatedTitle;
    }
    public String getTranslatedTitle(){
        return this.translatedTitle;
    }
    public void setTranslatedContent(String translatedContent){
        this.translatedContent = translatedContent;
    }
    public String getTranslatedContent(){
        return this.translatedContent;
    }
    public void setIsPaidOnly(boolean isPaidOnly){
        this.isPaidOnly = isPaidOnly;
    }
    public boolean getIsPaidOnly(){
        return this.isPaidOnly;
    }
    public void setDifficulty(String difficulty){
        this.difficulty = difficulty;
    }
    public String getDifficulty(){
        return this.difficulty;
    }
    public void setLikes(int likes){
        this.likes = likes;
    }
    public int getLikes(){
        return this.likes;
    }
    public void setDislikes(int dislikes){
        this.dislikes = dislikes;
    }
    public int getDislikes(){
        return this.dislikes;
    }
    public void setIsLiked(String isLiked){
        this.isLiked = isLiked;
    }
    public String getIsLiked(){
        return this.isLiked;
    }
    public void setSimilarQuestions(String similarQuestions){
        this.similarQuestions = similarQuestions;
    }
    public String getSimilarQuestions(){
        return this.similarQuestions;
    }
    public void setContributors(List<String> contributors){
        this.contributors = contributors;
    }
    public List<String> getContributors(){
        return this.contributors;
    }
    public void setLangToValidPlayground(String langToValidPlayground){
        this.langToValidPlayground = langToValidPlayground;
    }
    public String getLangToValidPlayground(){
        return this.langToValidPlayground;
    }
    public void setTopicTags(List<TopicTags> topicTags){
        this.topicTags = topicTags;
    }
    public List<TopicTags> getTopicTags(){
        return this.topicTags;
    }
    public void setCompanyTagStats(String companyTagStats){
        this.companyTagStats = companyTagStats;
    }
    public String getCompanyTagStats(){
        return this.companyTagStats;
    }
    public void setCodeSnippets(List<CodeSnippets> codeSnippets){
        this.codeSnippets = codeSnippets;
    }
    public List<CodeSnippets> getCodeSnippets(){
        return this.codeSnippets;
    }
    public void setStats(String stats){
        this.stats = stats;
    }
    public String getStats(){
        return this.stats;
    }
    public void setHints(List<String> hints){
        this.hints = hints;
    }
    public List<String> getHints(){
        return this.hints;
    }
    public void setSolution(Solution solution){
        this.solution = solution;
    }
    public Solution getSolution(){
        return this.solution;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setSampleTestCase(String sampleTestCase){
        this.sampleTestCase = sampleTestCase;
    }
    public String getSampleTestCase(){
        return this.sampleTestCase;
    }
    public void setMetaData(String metaData){
        this.metaData = metaData;
    }
    public String getMetaData(){
        return this.metaData;
    }
    public void setJudgerAvailable(boolean judgerAvailable){
        this.judgerAvailable = judgerAvailable;
    }
    public boolean getJudgerAvailable(){
        return this.judgerAvailable;
    }
    public void setJudgeType(String judgeType){
        this.judgeType = judgeType;
    }
    public String getJudgeType(){
        return this.judgeType;
    }
    public void setMysqlSchemas(List<String> mysqlSchemas){
        this.mysqlSchemas = mysqlSchemas;
    }
    public List<String> getMysqlSchemas(){
        return this.mysqlSchemas;
    }
    public void setEnableRunCode(boolean enableRunCode){
        this.enableRunCode = enableRunCode;
    }
    public boolean getEnableRunCode(){
        return this.enableRunCode;
    }
    public void setEnableTestMode(boolean enableTestMode){
        this.enableTestMode = enableTestMode;
    }
    public boolean getEnableTestMode(){
        return this.enableTestMode;
    }
    public void setEnvInfo(String envInfo){
        this.envInfo = envInfo;
    }
    public String getEnvInfo(){
        return this.envInfo;
    }
    public void set__typename(String __typename){
        this.__typename = __typename;
    }
    public String get__typename(){
        return this.__typename;
    }
}