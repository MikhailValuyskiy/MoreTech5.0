package com

import android.app.Application
import com.androidheroes.moretechhack.BuildConfig
import com.yandex.mapkit.MapKitFactory

class MoreTechApp:Application() {


    override fun onCreate() {
        super.onCreate()

        MapKitFactory.setApiKey(BuildConfig.MAP_API_KEY);
    }


}

