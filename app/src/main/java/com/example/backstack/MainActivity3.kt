package com.example.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TEST_TAG", "Activity 3    onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        findViewById<Button>(R.id.button3).setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }

    override fun onStart() {
        Log.d("TEST_TAG", "Activity 3    onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("TEST_TAG", "Activity 3    onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("TEST_TAG", "Activity 3    onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("TEST_TAG", "Activity 3    onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("TEST_TAG", "Activity 3    onDestroy")
        super.onDestroy()
    }

}