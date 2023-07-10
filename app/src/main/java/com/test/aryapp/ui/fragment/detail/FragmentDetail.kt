package com.test.aryapp.ui.fragment.detail

import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import com.test.aryapp.base.BaseFragment
import com.test.aryapp.databinding.FragmentDetailBinding
import com.test.aryapp.model.PhotosItem
import com.test.aryapp.utils.PHOTOS_ITEM
import com.test.aryapp.utils.loadImagesWithGlide



@AndroidEntryPoint
class FragmentDetail : BaseFragment<FragmentDetailBinding, DetailVM>() {
    override val viewModel: DetailVM by viewModels()

    override fun getViewBinding() = FragmentDetailBinding.inflate(layoutInflater)

    override fun onFragmentCreated() {
        val photo = arguments?.getSerializable(PHOTOS_ITEM) as PhotosItem?

        binding.apply {
            photo?.let {
                imgPhoto.loadImagesWithGlide(it.thumbnailUrl)
                txtContent.text = it.title
                txtMContent.text = it.title
               
            }
        }
    }
}