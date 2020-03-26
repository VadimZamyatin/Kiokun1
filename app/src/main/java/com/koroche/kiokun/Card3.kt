package com.koroche.kiokun
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
class Card3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card3)
    }
    fun next(v : View){
        val intent = Intent(this, Card4::class.java)
        startActivity(intent)
    }
}
