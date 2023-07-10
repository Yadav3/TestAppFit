package com.test.aryapp.repository

import com.test.aryapp.base.BaseRepository
import com.test.aryapp.model.PhotosItem
import com.test.aryapp.network.APIClientImpl
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject


class PhotosRepository @Inject
constructor(private val apiServiceImpl: APIClientImpl) : BaseRepository() {

    suspend fun getPhotos(
        scope: CoroutineScope,
        onSuccess: ((List<PhotosItem>?) -> Unit),
        onErrorAction: ((String?) -> Unit)
    ) =
        sendRequest(
            scope = scope,
            client = { apiServiceImpl.apiCollect.getPhotos() },
            onSuccess = {
                onSuccess(it)
            },
            onErrorAction = {
                onErrorAction(it)
            }
        )
}