package com.example.game_test

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.game_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var clicked:Boolean = false
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btncheat.setOnClickListener(this)

        firstqus()

    }


    private fun firstqus() {
        with(binding) {
            btnnext.isEnabled = true
            btnprev.isEnabled = false
            val question = "tehran is capital of iran"
                tvqus.text=question
            btnfalse.setOnClickListener {
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
                Toast.makeText(this@MainActivity, "Incorrect", Toast.LENGTH_SHORT).show()
            }
            btntrue.setOnClickListener {
                Toast.makeText(this@MainActivity, "correct!", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            btnnext.setOnClickListener {
                secqus()
            }
            val answer= "true"
            btncheat.setOnClickListener {
                val intent=Intent(this@MainActivity,Cheat::class.java)
                intent.putExtra("answer",answer)
                intent.putExtra("question",question)
                startActivity(intent)
            }
            if(clicked){
                btntrue.setOnClickListener {
                    Toast.makeText(this@MainActivity, "cheating is wrong", Toast.LENGTH_SHORT).show()
                }
                btnfalse.setOnClickListener {
                    Toast.makeText(this@MainActivity, "cheating is wrong", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }

    private fun secqus() {
        with(binding) {
            val question = "paris is capital of turky"
            tvqus.text = question
            btnnext.isEnabled = true
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true

            btnfalse.setOnClickListener {
                Toast.makeText(this@MainActivity, "correct", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            btntrue.setOnClickListener {
                Toast.makeText(this@MainActivity, "Incorrect", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            btnnext.setOnClickListener {
                thirdqus()
            }
            btnprev.setOnClickListener {
                firstqus()
            }
            val answer= "false"
            btncheat.setOnClickListener {
                val intent=Intent(this@MainActivity,Cheat::class.java)
                intent.putExtra("answer",answer)
                intent.putExtra("question",question)
                startActivity(intent)
            }
        }

    }

    private fun thirdqus() {
        with(binding) {
            val question = "Is China the largest country in the world?"
            tvqus.text = question
            btnnext.isEnabled = true
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            btnprev.setOnClickListener {
                secqus()
            }
            btnnext.setOnClickListener {
                forthqus()
            }

            btnfalse.setOnClickListener {
                Toast.makeText(this@MainActivity, "correct", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            btntrue.setOnClickListener {
                Toast.makeText(this@MainActivity, "Incorrect", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            val answer="false"
            btncheat.setOnClickListener {
                val intent=Intent(this@MainActivity,Cheat::class.java)
                intent.putExtra("answer",answer)
                intent.putExtra("question",question)
                startActivity(intent)
            }

        }

    }

    private fun forthqus() {
        with(binding) {
            val question="5+9 = 14"
            tvqus.text = question
            btnnext.isEnabled = true
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            btnprev.setOnClickListener {
                thirdqus()
            }
            btnnext.setOnClickListener {
                fifthqus()
            }

            btnfalse.setOnClickListener {
                Toast.makeText(this@MainActivity, "Incorrect", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            btntrue.setOnClickListener {
                Toast.makeText(this@MainActivity, "correct", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            val answer="true"
            btncheat.setOnClickListener {
                val intent=Intent(this@MainActivity,Cheat::class.java)
                intent.putExtra("answer",answer)
                intent.putExtra("question",question)
                startActivity(intent)
            }
        }



    }

    private fun fifthqus() {

        with(binding) {
            val question="Australia is both a country and a continent"
            tvqus.text =question
            btnnext.isEnabled = true
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            btnprev.setOnClickListener {
                forthqus()
            }
            btnnext.setOnClickListener {
                sixthqus()
            }

            btnfalse.setOnClickListener {
                Toast.makeText(this@MainActivity, "Incorrect", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            btntrue.setOnClickListener {
                Toast.makeText(this@MainActivity, "correct", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            val answer="true"
            btncheat.setOnClickListener {
                val intent = Intent(this@MainActivity, Cheat::class.java)
                intent.putExtra("answer", answer)
                intent.putExtra("question", question)
                startActivity(intent)
            }

        }


    }

    private fun sixthqus() {
        with(binding) {
            val question="Humans have 4 senses"
            tvqus.text =question
                btnnext.isEnabled = true
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            btnprev.setOnClickListener {
                fifthqus()
            }
            btnnext.setOnClickListener {
                seventhqus()
            }

            btnfalse.setOnClickListener {
                Toast.makeText(this@MainActivity, "correct", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            btntrue.setOnClickListener {
                Toast.makeText(this@MainActivity, "Incorrect", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            val answer="false"
            btncheat.setOnClickListener {
                val intent=Intent(this@MainActivity,Cheat::class.java)
                intent.putExtra("answer",answer)
                intent.putExtra("question",question)
                startActivity(intent)
            }
        }

    }

    private fun seventhqus() {

        with(binding) {
            val question="you need oxygen for breathing"
            tvqus.text =question
            btnnext.isEnabled = true
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            btnprev.setOnClickListener {
                sixthqus()
            }
            btnnext.setOnClickListener {
                eighthqus()
            }

            btnfalse.setOnClickListener {
                Toast.makeText(this@MainActivity, "Incorrect", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            btntrue.setOnClickListener {
                Toast.makeText(this@MainActivity, "correct", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            val answer="true"
            btncheat.setOnClickListener {
                val intent=Intent(this@MainActivity,Cheat::class.java)
                intent.putExtra("answer",answer)
                intent.putExtra("question",question)
                startActivity(intent)
            }
        }

    }

    private fun eighthqus() {
        with(binding) {
            val question= " The national flag of America has stars and stripes on it."
            tvqus.text = question
            btnnext.isEnabled = true
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            btnprev.setOnClickListener {
                seventhqus()
            }
            btnnext.setOnClickListener {
                ninthqus()
            }
            btnfalse.setOnClickListener {
                Toast.makeText(this@MainActivity, "Incorrect", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            btntrue.setOnClickListener {
                Toast.makeText(this@MainActivity, "correct", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false

            }
            val answer="true"
            btncheat.setOnClickListener {
                val intent=Intent(this@MainActivity,Cheat::class.java)
                intent.putExtra("answer",answer)
                intent.putExtra("question",question)
                startActivity(intent)
            }
        }

    }

    private fun ninthqus() {
        with(binding) {
            val question="Baby panda is bigger than a mouse after being born"
            tvqus.text=question
            btnnext.isEnabled = true
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            btnprev.setOnClickListener {
                eighthqus()
            }
            btnnext.setOnClickListener {
                tenthqus()
            }
            btnfalse.setOnClickListener {
                Toast.makeText(this@MainActivity, "correct", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false

            }
            btntrue.setOnClickListener {
                Toast.makeText(this@MainActivity, "Incorrect", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false

            }
            val answer="false"
            btncheat.setOnClickListener {
                val intent=Intent(this@MainActivity,Cheat::class.java)
                intent.putExtra("answer",answer)
                intent.putExtra("question",question)
                startActivity(intent)
            }
        }

    }

    private fun tenthqus() {
        with(binding) {
            val question="The smallest particle of an element is the molecule"
            tvqus.text = question
            btnnext.isEnabled = false
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            btnprev.setOnClickListener {
                ninthqus()
            }
            btnfalse.setOnClickListener {
                Toast.makeText(this@MainActivity, "correct", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false

            }
            btntrue.setOnClickListener {
                Toast.makeText(this@MainActivity, "Incorrect", Toast.LENGTH_SHORT).show()
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            val answer="false"
            btncheat.setOnClickListener {
                val intent=Intent(this@MainActivity,Cheat::class.java)
                intent.putExtra("answer",answer)
                intent.putExtra("question",question)
                startActivity(intent)
            }
        }

    }

    override fun onClick(v: View?) {
        clicked= true
    }


}