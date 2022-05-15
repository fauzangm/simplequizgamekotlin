package com.eduside.quizninja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import com.eduside.quizninja.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {

    private lateinit var quizBinding: ActivityQuizBinding
    private var keys = " S N A K E"
    private var correctasnwer =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        quizBinding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(quizBinding.root)

        quizBinding.skilltwo.visibility = View.GONE
        quizBinding.skillone.visibility = View.GONE
        quizBinding.btnSkilltwo.visibility = View.GONE
        quizBinding.btnSkillone.visibility = View.GONE

        onClick()
    }

    private fun onClick() {
        quizBinding.tvS.setOnClickListener {
            var answer =  quizBinding.tvAnswer.text
            quizBinding.tvAnswer.text = "$answer S"
            quizBinding.tvS.visibility = View.GONE
        }

        quizBinding.tvN.setOnClickListener {
            var answer =  quizBinding.tvAnswer.text
            quizBinding.tvAnswer.text = "$answer N"
            quizBinding.tvN.visibility = View.GONE
        }
        quizBinding.tvA.setOnClickListener {
            var answer =  quizBinding.tvAnswer.text
            quizBinding.tvAnswer.text = "$answer A"
            quizBinding.tvA.visibility = View.GONE
        }
        quizBinding.tvK.setOnClickListener {
            var answer =  quizBinding.tvAnswer.text
            quizBinding.tvAnswer.text = "$answer K"
            quizBinding.tvK.visibility = View.GONE
        }
        quizBinding.tvE.setOnClickListener {
            var answer =  quizBinding.tvAnswer.text
            quizBinding.tvAnswer.text = "$answer E"
            quizBinding.tvE.visibility = View.GONE
        }

        quizBinding.btnDone.setOnClickListener {

            if (Cekvalid()){

                Toast.makeText(this,"TRUE", Toast.LENGTH_SHORT).show()
                quizBinding.btnSkillone.visibility = View.VISIBLE
                quizBinding.btnSkilltwo.visibility = View.VISIBLE

                quizBinding.btnSkillone.setOnClickListener {
                    quizBinding.skillone.visibility = View.VISIBLE
                    Handler(Looper.getMainLooper()).postDelayed({
                        quizBinding.lotMonster.visibility = View.GONE
                    },2000)
                }


                quizBinding.btnSkilltwo.setOnClickListener {
                    quizBinding.skilltwo.visibility = View.VISIBLE
                    Handler(Looper.getMainLooper()).postDelayed({
                        quizBinding.lotMonster.visibility = View.GONE
                    },2000)
                }

            }else{
                Toast.makeText(this,"FALSE", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun Cekvalid(): Boolean {

        correctasnwer = quizBinding.tvAnswer.text.toString()
        return keys == correctasnwer
    }

}
















