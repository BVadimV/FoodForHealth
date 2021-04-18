package com.vadim.healingfood

import android.app.Activity
import android.app.Application
import android.app.Service
import android.content.Context
import android.content.res.Configuration
import androidx.lifecycle.ProcessLifecycleOwner
import androidx.multidex.MultiDex
import com.vadim.healingfood.data.app_lifecycle.ApplicationObserver
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.HasServiceInjector
import javax.inject.Inject

class App : Application(), HasActivityInjector, HasServiceInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var dispatchingServiceInjector: DispatchingAndroidInjector<Service>

    @Inject
    lateinit var lifecycleListener: ApplicationObserver

    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)

        ProcessLifecycleOwner.get()
            .lifecycle
            .addObserver(lifecycleListener)
    }

    override fun activityInjector(): AndroidInjector<Activity>? = dispatchingAndroidInjector

    override fun serviceInjector(): AndroidInjector<Service>? = dispatchingServiceInjector

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
//        super.attachBaseContext(LocaleUtils.setLocale(base))
        MultiDex.install(this)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
//        LocaleUtils.setLocale(this)
    }

}