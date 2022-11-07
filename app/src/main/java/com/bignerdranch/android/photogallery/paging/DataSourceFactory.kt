package com.bignerdranch.android.photogallery.paging

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.bignerdranch.android.photogallery.GalleryItem
import com.bignerdranch.android.photogallery.api.FlickrApi
import java.util.concurrent.Executor

class DataSourceFactory() : DataSource.Factory<Int, GalleryItem>() {

    val sourceLiveData = MutableLiveData<PageKeyedDataSource>()

    override fun create(): DataSource<Int, GalleryItem> {
        val latestSource = PageKeyedDataSource()
        Log.d("LatestSource", "$latestSource")
        sourceLiveData.postValue(latestSource)
        Log.d("SourceLiveData", "${sourceLiveData}")
        return latestSource
    }
}