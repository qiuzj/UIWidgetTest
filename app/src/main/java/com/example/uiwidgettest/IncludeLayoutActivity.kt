package com.example.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class IncludeLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_include_layout)
        // 隐藏标题栏
        supportActionBar?.hide()
    }
}