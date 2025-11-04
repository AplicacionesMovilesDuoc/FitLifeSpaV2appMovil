package com.mjperezm.fitlifespaapp02

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mjperezm.fitlifespaapp02.databinding.ActivitySplash2Binding
import kotlin.jvm.java

class SplashActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivitySplash2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySplash2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }


    }




}