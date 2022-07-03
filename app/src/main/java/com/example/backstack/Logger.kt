package com.example.backstack

import android.app.Activity
import android.app.ActivityManager
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

object Logger {

    fun logBackStack(activity: Activity) {
        val m = activity.getSystemService(AppCompatActivity.ACTIVITY_SERVICE) as ActivityManager
        val runningTaskInfoList = m.getRunningTasks(10)
        val itr: Iterator<ActivityManager.RunningTaskInfo> = runningTaskInfoList.iterator()
        while (itr.hasNext()) {
            val runningTaskInfo = itr.next()
            val id = runningTaskInfo.id
            val desc = runningTaskInfo.description
            val numOfActivities = runningTaskInfo.numActivities
            val topActivity = runningTaskInfo.topActivity!!.shortClassName
            Log.d(
                "TEST_TAG", "" +
                        "  id = $id" +
                        "  desc = $desc" +
                        "  numOfActivities = $numOfActivities" +
                        "  topActivity = $topActivity"
            )
        }
    }

}