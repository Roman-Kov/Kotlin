package com.rojer_ko.lesson_1.lesson_1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rojer_ko.lesson_1.R
import kotlinx.android.synthetic.main.activity_main.*

class Lesson1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            Toast.makeText(this, "Hello World",Toast.LENGTH_LONG).show()
        }
    }
}

