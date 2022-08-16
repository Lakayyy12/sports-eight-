package com.application.footballbettingtips

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutUs : AppCompatActivity() {

    private var btn : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        btn = findViewById(R.id.btn)
        btn?.setOnClickListener{
            onBackPressed()
        }
    }
}