package com.bignerdranch.android.photogallery.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface FlickrApi {

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=be7dc1096339c67be41178440284e4ec" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
//    fun fetchPhotos(): Call<FlickrResponse>
    fun fetchPhotos(@Query("per_page")perPage: Int, @Query("page")pageNum: Int): Call<FlickrResponse>
}