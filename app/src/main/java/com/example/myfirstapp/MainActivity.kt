package com.example.myfirstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val raffleList: ArrayList<Int> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun updateRaffleOutput(view: View) {
        raffleList.add(randomInt())
        textViewOutput.text = "${raffleList.sorted()}"
        textViewInput.text = "Input: ${raffleList.last()}"
    }

    private fun randomInt(): Int {
        return (1023 * Math.random()).toInt()
    }
}
