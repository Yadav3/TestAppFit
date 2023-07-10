package com.test.aryapp.ui.fragment.detail

import android.app.Application
import dagger.hilt.android.lifecycle.HiltViewModel
import com.test.aryapp.base.BaseViewModel
import javax.inject.Inject


@HiltViewModel
class DetailVM @Inject constructor(
    myApp: Application
) : BaseViewModel(app = myApp)