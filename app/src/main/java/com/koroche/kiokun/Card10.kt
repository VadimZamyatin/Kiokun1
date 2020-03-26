package com.koroche.kiokun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Card10 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card10)
    }
    fun next(v : View){
        val intent = Intent(this, Card5::class.java)
        startActivity(intent)
    }
}
