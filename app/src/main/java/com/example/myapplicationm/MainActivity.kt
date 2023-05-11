package com.example.myapplicationm

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe1(view: View) {
        val myToast = Toast.makeText(this, "Yeah!!!", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun toastMe2(view: View) {
        val myToast = Toast.makeText(this, "Yeah!!", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun toastMe3(view: View) {
        val myToast = Toast.makeText(this, "Yeah!", Toast.LENGTH_SHORT)

        myToast.show()
    }

}