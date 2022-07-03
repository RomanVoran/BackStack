package com.example.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TEST_TAG", "Activity 2    onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<Button>(R.id.button2).setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }

    override fun onStart() {
        Log.d("TEST_TAG", "Activity 2    onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("TEST_TAG", "Activity 2    onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("TEST_TAG", "Activity 2    onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("TEST_TAG", "Activity 2    onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("TEST_TAG", "Activity 2    onDestroy")
        super.onDestroy()
    }

}