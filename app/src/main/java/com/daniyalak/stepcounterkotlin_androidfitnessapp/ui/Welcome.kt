package com.daniyalak.stepcounterkotlin_androidfitnessapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daniyalak.stepcounterkotlin_androidfitnessapp.R

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    fun start(v: View)
    {

        val intent:Intent = Intent(this,MainActivity::class.java)
        startActivity(intent)


    }
}