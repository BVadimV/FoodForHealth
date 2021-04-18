package com.vadim.healingfood.ui.activity.splash

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import javax.inject.Inject

class SplashViewModel
@Inject constructor(
    private val app: Application
) : AndroidViewModel(app) {

    init {
        //do nothing
    }

}