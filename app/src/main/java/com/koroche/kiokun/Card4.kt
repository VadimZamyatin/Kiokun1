package com.koroche.kiokun
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
class Card4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card4)
    }
    fun next(v : View){
        val intent = Intent(this, Card5::class.java)
        startActivity(intent)
    }
    fun next1(v : View){
        val intent = Intent(this, Card6::class.java)
        startActivity(intent)
    }
    fun next2(v : View){
        val intent = Intent(this, Card7::class.java)
        startActivity(intent)
    }
}
