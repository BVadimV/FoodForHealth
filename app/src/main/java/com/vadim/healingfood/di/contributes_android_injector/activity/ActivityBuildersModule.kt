package com.vadim.healingfood.di.contributes_android_injector.activity

import com.vadim.healingfood.di.contributes_android_injector.fragment.MainFragmentsBuildersModule
import com.vadim.healingfood.di.contributes_android_injector.fragment.SplashFragmentsBuildersModule
import com.vadim.healingfood.ui.activity.main.MainActivity
import com.vadim.healingfood.ui.activity.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
        modules = [
            SplashFragmentsBuildersModule::class
        ]
    )
    internal abstract fun splashActivity(): SplashActivity

    @ContributesAndroidInjector(
        modules = [
            MainFragmentsBuildersModule::class
        ]
    )
    internal abstract fun mainActivity(): MainActivity
}