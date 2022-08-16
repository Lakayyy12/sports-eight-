package com.application.footballbettingtips

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomePage : AppCompatActivity() {

    private var btn : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        btn = findViewById(R.id.btn2)
        btn?.setOnClickListener{
            onBackPressed()
        }
    }
}