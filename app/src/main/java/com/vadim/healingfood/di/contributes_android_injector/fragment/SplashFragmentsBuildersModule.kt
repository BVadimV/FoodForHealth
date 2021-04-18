package com.vadim.healingfood.di.contributes_android_injector.fragment
\
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SplashFragmentsBuildersModule {

    @ContributesAndroidInjector
    internal abstract fun splashFragment(): SplashFragment

}