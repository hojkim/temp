package com.hkim.dotify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private var playCount = Random.nextInt(0, 100000)
    private val tvPlayCount: TextView by lazy { findViewById<TextView>(R.id.tvPlayCount)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvPlayCount.text = "$playCount plays"
    }

    fun playClicked (view: View) {
        playCount++
        tvPlayCount.text = "$playCount plays"
    }

    fun previousClicked (view: View) {
        Toast.makeText(this, "Skipping to previous track", Toast.LENGTH_SHORT).show()
    }

    fun nextClicked (view: View) {
        Toast.makeText(this, "Skipping to next track", Toast.LENGTH_SHORT).show()
    }
}
