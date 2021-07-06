package com.tubianto.bottomnavigation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var tvText: TextView
    private lateinit var navigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        navigationListener()
    }

    private fun init() {
        tvText = findViewById(R.id.tv_text)
        navigation = findViewById(R.id.navigation)
    }

    private fun navigationListener() {
        navigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    tvText.text = item.title
                    return@setOnItemSelectedListener true
                }
                R.id.nav_favorite -> {
                    tvText.text = item.title
                    return@setOnItemSelectedListener true
                }
                R.id.nav_account -> {
                    tvText.text = item.title
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}