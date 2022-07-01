package com.example.memoryleaksreasons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.memoryleaksreasons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnActivityB.setOnClickListener {
            startActivity(Intent(this@MainActivity,ActivityB::class.java))
        }

        binding.btnActivityC.setOnClickListener {
            startActivity(Intent(this@MainActivity,ActivityC::class.java))
        }



    }
}