package com.maximeesprit.traningandroidapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main3.*
import java.lang.Exception

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);

        //Activate back button
        setSupportActionBar(toolbar);
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
    }

    override fun onBackPressed() {
        super.onBackPressed();
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main_3_activity, menu);

        return super.onCreateOptionsMenu(menu);
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if (item?.itemId == R.id.share)
        {
            val shareIntent = Intent();
            shareIntent.action = Intent.ACTION_SEND;
            shareIntent.type = "text/plain";
            shareIntent.putExtra(Intent.EXTRA_TEXT, "This is my moto :-)");

            startActivity(Intent.createChooser(shareIntent, getString(R.string.share_intent_title)));
        }

        return super.onOptionsItemSelected(item)
    }
}
