package com.example.devyankshaw.jsonparsingusingretrofitfinal;

public class Author
{
    private String id;

    private String displayName;

    private String url;

    private Image image;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setDisplayName(String displayName){
        this.displayName = displayName;
    }
    public String getDisplayName(){
        return this.displayName;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return this.url;
    }
    public void setImage(Image image){
        this.image = image;
    }
    public Image getImage(){
        return this.image;
    }
}