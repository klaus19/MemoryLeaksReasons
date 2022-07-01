package com.example.memoryleaksreasons

import android.app.Activity

object Somelistener {

    private val activityArray = ArrayList<Activity>()

    fun register(activity: Activity){
        activityArray.add(activity)
    }

    fun unregister(activity: Activity){
        activityArray.remove(activity)
    }


}