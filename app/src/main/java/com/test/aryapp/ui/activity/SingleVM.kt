package com.test.aryapp.ui.activity

import android.app.Application
import dagger.hilt.android.lifecycle.HiltViewModel
import com.test.aryapp.base.BaseViewModel
import javax.inject.Inject



@HiltViewModel
class SingleVM
@Inject constructor(myApp: Application) : BaseViewModel(app = myApp)