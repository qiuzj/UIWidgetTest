package com.example.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener(this)

        val buttonChangeImg: Button = findViewById(R.id.buttonChangeImg)
        buttonChangeImg.setOnClickListener(this)

        val buttonToggleProgressBar: Button = findViewById(R.id.buttonToggleProgressBar)
        buttonToggleProgressBar.setOnClickListener(this)

        val buttonProgressBarIncr: Button = findViewById(R.id.buttonProgressBarIncr)
        buttonProgressBarIncr.setOnClickListener(this)

        val buttonShowAlertDialog: Button = findViewById(R.id.buttonShowAlertDialog)
        buttonShowAlertDialog.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
                val editText: EditText = findViewById(R.id.editText)
                Toast.makeText(this, editText.text, Toast.LENGTH_SHORT).show()
            }
            R.id.buttonChangeImg -> {
                val imageView: ImageView = findViewById(R.id.imageView)
                imageView.setImageResource(R.drawable.kontlin_singleton)
            }
            R.id.buttonToggleProgressBar -> {
                val progressBar: ProgressBar = findViewById(R.id.progressBar)
                if (progressBar.visibility == View.VISIBLE) {
                    progressBar.visibility = View.GONE
                } else {
                    progressBar.visibility = View.VISIBLE
                }
            }
            R.id.buttonProgressBarIncr -> {
                val progressBarLine: ProgressBar = findViewById(R.id.progressBarLine)
                progressBarLine.progress += 10
            }
            R.id.buttonShowAlertDialog -> {
//                val build: AlertDialog.Builder = AlertDialog.Builder(this)
//                build.setTitle()
//                build.setMessage()
//                build.setCancelable()
//                build.setPositiveButton()
//                build.setNegativeButton()
//                build.show()

                AlertDialog.Builder(this).apply {
                    setTitle("This is Dialog")
                    setMessage("Something important.")
                    setCancelable(false)
                    setPositiveButton("OK") { dialog, which ->
                    }
                    setNegativeButton("Cancel") { dialog, which ->
                    }
                    show()
                }
            }
        }
    }
}