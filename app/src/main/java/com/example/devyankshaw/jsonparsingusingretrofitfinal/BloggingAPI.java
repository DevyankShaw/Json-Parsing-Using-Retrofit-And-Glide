package com.example.devyankshaw.jsonparsingusingretrofitfinal;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Url;

public class BloggingAPI {

    public static final String key = "AIzaSyCADCOIxHqpwoXmHG68PGfDvgpCXUoyYmg";
    public static final String baseUrl = "https://www.googleapis.com/blogger/v3/blogs/1684406937700525822/posts/";

    public static PostService postService = null;

    public static PostService getPostService(){

        if(postService == null){

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            postService = retrofit.create(PostService.class);
        }
        return postService;
    }

    public interface PostService{

        @GET
        Call<PostList> getPostList(@Url String url);

        /*@GET("(postId)?key="+key)
        Call<Posts> getPosts(@Path("postId") String id);*/
    }
}
