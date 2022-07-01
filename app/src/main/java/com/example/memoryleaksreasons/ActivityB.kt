package com.example.memoryleaksreasons


import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception
import java.util.logging.Logger

//Reason 1 - Use of static views/context/activity
class ActivityB:AppCompatActivity() {

    //Here as context is decalared as static, GC won't be able to flush it out


    companion object{

        lateinit var context: Context
    }

    val bitMapArrayList = ArrayList<Bitmap>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        context = this
        Thread(Runnable {

            try {
                val bitmap1: Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.p1)
                val bitmap2: Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.p2)
                val bitmap3: Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.p3)

                bitMapArrayList.add(bitmap1)
                bitMapArrayList.add(bitmap2)
                bitMapArrayList.add(bitmap3)
            }catch (e:Exception){
                Logger.getLogger(ActivityB::class.java.name).warning(e.toString())
            }
        }).start()


    }

}