package com.proxybi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tomboldaftar = findViewById<Button>(R.id.daftar)
        tomboldaftar.setOnClickListener{ view -> Snackbar.make(view, "Button Daftar is pressed",
            Snackbar.LENGTH_LONG).setAction("Action", null).show()}
    }

}