package com.maximeesprit.traningandroidapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //Show snackbar
        showSnackbarButton.setOnClickListener {
            Snackbar.make(coordinatorLayout, "Sample snack bar", Snackbar.LENGTH_LONG)
                .show();
        }

        //Go to second Activity
        showSecondPageButton.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java);

            startActivity(intent);
        }

        //Go to thrid page
        showThirdPageButton.setOnClickListener{
            val intent = Intent(this, Main3Activity::class.java);

            startActivity(intent);
        }
    }
}
