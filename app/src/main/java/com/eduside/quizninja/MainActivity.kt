package com.eduside.quizninja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eduside.quizninja.databinding.ActivityMainBinding
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        onClick()

    }

    private fun onClick() {
        mainBinding.btnStart.setOnClickListener {
            startActivity<QuizActivity>()
        }
    }


}