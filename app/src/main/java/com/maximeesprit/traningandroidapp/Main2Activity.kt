package com.maximeesprit.traningandroidapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Main2Activity : AppCompatActivity() {

    val TAG = "Main2Activity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try
        {
            setContentView(R.layout.activity_main2);
        }
        catch(e: Exception)
        {
            Log.println(Log.DEBUG, TAG, e.message);
        }
    }
}
