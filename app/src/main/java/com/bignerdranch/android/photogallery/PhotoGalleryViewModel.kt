package com.bignerdranch.android.photogallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.Config
import androidx.paging.PagedList
import androidx.paging.toLiveData
import com.bignerdranch.android.photogallery.paging.DataSourceFactory

class PhotoGalleryViewModel : ViewModel() {

    private val myPagingConfig = Config(
        pageSize = 100,
        prefetchDistance = 500,
        enablePlaceholders = true
    )

    private val dataSourceFactory = DataSourceFactory()
    val galleryItemList = dataSourceFactory.toLiveData(myPagingConfig)

    fun refresh(){
        dataSourceFactory.sourceLiveData.value?.invalidate()

    }
}