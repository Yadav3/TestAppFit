package com.test.aryapp.ui.fragment.list

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import com.test.aryapp.base.BaseFragment
import com.test.aryapp.databinding.FragmentListBinding
import com.test.aryapp.model.PhotosItem
import com.test.aryapp.utils.ApiState
import com.test.aryapp.utils.visibleIf
import kotlinx.coroutines.flow.collect



@AndroidEntryPoint
class FragmentList : BaseFragment<FragmentListBinding, ListVM>() {
    override val viewModel: ListVM by viewModels()

    override fun getViewBinding() = FragmentListBinding.inflate(layoutInflater)

    private val photosListAdapter = PhotosListAdapter(::onClickAction)

    override fun onFragmentCreated() {
        binding.rvPhotos.adapter = photosListAdapter
    }

    override fun observe() {

        lifecycleScope.launchWhenResumed {

            viewModel.onPhotosList.collect {
                when (it) {
                    ApiState.Empty -> {}

                    ApiState.Loading -> {
                        viewModel.loadingDetection.postValue(true)
                    }

                    is ApiState.Failure -> {
                        binding.apply {
                            rvPhotos.visibleIf(false)
                            txtNoRecord.visibleIf(true)
                        }
                    }

                    is ApiState.Success -> {
                        binding.apply {
                            txtNoRecord.visibleIf(false)
                            rvPhotos.visibleIf(true)
                        }
                        photosListAdapter.replaceData(it.data)
                    }
                }
            }
        }
    }

    private fun onClickAction(photoItem: PhotosItem) {
        viewModel.goToDetail(photoItem)
    }
}