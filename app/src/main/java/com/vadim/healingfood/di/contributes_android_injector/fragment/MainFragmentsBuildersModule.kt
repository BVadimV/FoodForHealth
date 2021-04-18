package com.vadim.healingfood.di.contributes_android_injector.fragment

import com.test.facedetection.ui.main.MainFragment
import com.test.facedetection.ui.splash.SplashFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentsBuildersModule {

    @ContributesAndroidInjector
    internal abstract fun mainFragment(): MainFragment

}