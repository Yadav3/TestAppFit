package com.test.aryapp.ui.fragment.list

import android.app.Application
import android.os.Bundle
import androidx.lifecycle.viewModelScope
import com.test.aryapp.R
import dagger.hilt.android.lifecycle.HiltViewModel
import com.test.aryapp.base.BaseViewModel
import com.test.aryapp.model.PhotosItem
import com.test.aryapp.repository.PhotosRepository
import com.test.aryapp.utils.ApiState
import com.test.aryapp.utils.PHOTOS_ITEM
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListVM @Inject constructor(
    myApp: Application,
    private val photosRepository: PhotosRepository
) : BaseViewModel(app = myApp) {

    private val _onPhotosList = MutableStateFlow<ApiState<List<PhotosItem>?>>(ApiState.Empty)
    val onPhotosList: StateFlow<ApiState<List<PhotosItem>?>> = _onPhotosList

    init {
        getPhotos()
    }

    private fun getPhotos() = viewModelScope.launch {
        _onPhotosList.value = ApiState.Loading
        photosRepository.getPhotos(
            scope = viewModelScope,
            onSuccess = {
                loadingDetection.postValue(false)
                _onPhotosList.value = ApiState.Success(it)
            }, onErrorAction = {
                loadingDetection.postValue(false)
                _onPhotosList.value = ApiState.Failure(it)
            })
    }


    fun goToDetail(photoItems: PhotosItem) {
        Bundle().apply {
            putSerializable(PHOTOS_ITEM, photoItems)
            navigateFragment(R.id.action_global_fragmentDetail, this)
        }
    }
}