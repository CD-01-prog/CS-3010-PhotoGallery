package com.example.photogallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

private const val TAG = "AppDebug"

class PhotoGalleryViewModel: ViewModel() {

    val galleryItemLiveData: LiveData<List<GalleryItem>>

    init {
        galleryItemLiveData = FlickrFetchr().fetchPhotos()
    }
}