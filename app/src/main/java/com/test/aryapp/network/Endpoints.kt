package com.test.aryapp.network

import com.test.aryapp.model.PhotosItem
import retrofit2.http.GET



interface Endpoints {

    @GET(NetworkingConstants.URL_PHOTOS)
    suspend fun getPhotos(): List<PhotosItem>

}