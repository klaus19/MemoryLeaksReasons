package com.example.memoryleaksreasons

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception
import java.util.logging.Logger

class ActivityC:AppCompatActivity() {

    companion object{
        lateinit var context: Context
    }

    val bmpArray = ArrayList<Bitmap>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        context=this
        Thread(Runnable {
            try {
                val bitmap1: Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.p1)
                val bitmap2: Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.p2)
                val bitmap3: Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.p3)

                bmpArray.add(bitmap1)
                bmpArray.add(bitmap2)
                bmpArray.add(bitmap3)


            }catch (e:Exception){
                Logger.getLogger(ActivityC::class.java.name).warning(e.toString())
            }
        })


    }
}