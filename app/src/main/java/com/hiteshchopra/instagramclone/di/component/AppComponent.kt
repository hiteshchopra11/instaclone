package com.hiteshchopra.instagramclone.di.component

import android.content.Context
import com.hiteshchopra.instagramclone.BaseApplication
import com.hiteshchopra.instagramclone.di.module.ActivityBindingModule
import com.hiteshchopra.instagramclone.di.module.AppModule
import com.hiteshchopra.instagramclone.di.qualifier.ApplicationContext
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        ActivityBindingModule::class,
        AndroidSupportInjectionModule::class,
    ]
)
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<BaseApplication>() {
        @BindsInstance
        abstract fun appContext(@ApplicationContext context: Context)

        override fun seedInstance(instance: BaseApplication?) {
            appContext(instance!!.applicationContext)
        }
    }
}