package com.example.uiwidgettest

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    init {
        // 通过LayoutInflater的from()方法可以构建出
        // 一个LayoutInflater对象，然后调用inflate()方法就可以动态加载一个布局文件。
        // inflate()方法接收两个参数：第一个参数是要加载的布局文件的id，这里我们传入
        // R.layout.title；第二个参数是给加载好的布局再添加一个父布局，这里我们想要指定为
        // TitleLayout，于是直接传入this。
        LayoutInflater.from(context).inflate(R.layout.title, this)

        val titleBack: Button = findViewById(R.id.titleBack)
        titleBack.setOnClickListener {
            val activity = context as Activity
            activity.finish()
        }

        val titleEdit: Button = findViewById(R.id.titleEdit)
        titleEdit.setOnClickListener {
            Toast.makeText(context, "You clicked Edit button", Toast.LENGTH_SHORT).show()
        }
    }
}