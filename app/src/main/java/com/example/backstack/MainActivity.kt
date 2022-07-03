package com.example.backstack

import android.app.ActivityManager
import android.app.ActivityManager.RunningTaskInfo
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TEST_TAG", "Activity 1    onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button1).setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }

    override fun onStart() {
        Log.d("TEST_TAG", "Activity 1    onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("TEST_TAG", "Activity 1    onResume")
        super.onResume()
        Logger.logBackStack(this)
    }

    override fun onPause() {
        Log.d("TEST_TAG", "Activity 1    onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("TEST_TAG", "Activity 1    onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("TEST_TAG", "Activity 1    onDestroy")
        super.onDestroy()
    }


}