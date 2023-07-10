package com.test.aryapp.ui.fragment.list

import android.view.LayoutInflater
import android.view.ViewGroup
import com.test.aryapp.base.BaseAdapter
import com.test.aryapp.base.BaseHolder
import com.test.aryapp.databinding.ItemPhotosBinding
import com.test.aryapp.model.PhotosItem
import com.test.aryapp.utils.loadImagesWithGlide


class PhotosListAdapter(private val onClickAction: ((PhotosItem) -> Unit)) :
    BaseAdapter<PhotosItem, ItemPhotosBinding, PhotosListHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PhotosListHolder {
        return PhotosListHolder(
            ItemPhotosBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            onClickAction
        )
    }

}

class PhotosListHolder(
    viewBinding: ItemPhotosBinding,
    private val onClickAction: ((PhotosItem) -> Unit)
) :
    BaseHolder<PhotosItem, ItemPhotosBinding>(viewBinding) {
    override fun bind(binding: ItemPhotosBinding, item: PhotosItem?) {
        item?.let { photo ->
            binding.apply {
                imgTham.loadImagesWithGlide(photo.thumbnailUrl)
                txtTitle.text = photo.title
                txtSubTitle.text = photo.url

                cvParent.setOnClickListener {
                    onClickAction.invoke(photo)
                }
            }
        } ?: return
    }
}