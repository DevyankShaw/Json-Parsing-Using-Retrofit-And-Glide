package com.example.devyankshaw.jsonparsingusingretrofitfinal;

public class Items
{
    private String kind;

    private String id;

    private Blog blog;

    private String published;

    private String updated;

    private String etag;

    private String url;

    private String selfLink;

    private String title;

    private String content;

    private Author author;

    private Replies replies;

    public void setKind(String kind){
        this.kind = kind;
    }
    public String getKind(){
        return this.kind;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setBlog(Blog blog){
        this.blog = blog;
    }
    public Blog getBlog(){
        return this.blog;
    }
    public void setPublished(String published){
        this.published = published;
    }
    public String getPublished(){
        return this.published;
    }
    public void setUpdated(String updated){
        this.updated = updated;
    }
    public String getUpdated(){
        return this.updated;
    }
    public void setEtag(String etag){
        this.etag = etag;
    }
    public String getEtag(){
        return this.etag;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return this.url;
    }
    public void setSelfLink(String selfLink){
        this.selfLink = selfLink;
    }
    public String getSelfLink(){
        return this.selfLink;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return this.content;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
    public Author getAuthor(){
        return this.author;
    }
    public void setReplies(Replies replies){
        this.replies = replies;
    }
    public Replies getReplies(){
        return this.replies;
    }
}