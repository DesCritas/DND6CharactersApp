package com.descritas.dnd6charactersapp.core.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.descritas.dnd6charactersapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val fragment = PageFragment()
        //supportFragmentManager.beginTransaction()
        //    .replace(R.id.container, fragment)
        //    .commit()
    }
}