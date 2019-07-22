package com.example.devyankshaw.jsonparsingusingretrofitfinal;

public class Replies
{
    private String totalItems;

    private String selfLink;

    public void setTotalItems(String totalItems){
        this.totalItems = totalItems;
    }
    public String getTotalItems(){
        return this.totalItems;
    }
    public void setSelfLink(String selfLink){
        this.selfLink = selfLink;
    }
    public String getSelfLink(){
        return this.selfLink;
    }
}

