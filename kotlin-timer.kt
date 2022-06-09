package com.example.kotlin_timer_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0

        val timer = object: CountDownTimer(9999999999, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                count+=1
                textViewTimer.text = count.toString();
            }

            override fun onFinish() {
                TODO("Not yet implemented")
            }
        }

        buttonStart.setOnClickListener {
            timer.start()
        }

        buttonStop.setOnClickListener {
            timer.cancel()
        }

        buttonReset.setOnClickListener {
            timer.cancel()
            count = 0;
            textViewTimer.text = count.toString();
        }
    }
}
