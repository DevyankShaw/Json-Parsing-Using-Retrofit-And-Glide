package com.example.devyankshaw.jsonparsingusingretrofitfinal;

import java.util.List;

public class PostList {
    private String nextPageToken;

    private String kind;

    private List<Items> items;

    private String etag;

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return this.kind;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public List<Items> getItems() {
        return this.items;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getEtag() {
        return this.etag;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
}
