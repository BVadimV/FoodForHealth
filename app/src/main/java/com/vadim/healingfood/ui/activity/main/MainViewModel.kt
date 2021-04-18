package com.vadim.healingfood.ui.activity.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.test.facedetection.data.preferences.Preferences
import javax.inject.Inject

class MainViewModel
@Inject constructor(
        private val app: Application,
        private val preferences: Preferences
) : AndroidViewModel(app) {



}