package com.example.game_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.game_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firstqus()

    }


    private fun firstqus() {
        with(binding) {
            btnnext.isEnabled = true
            btnprev.isEnabled = false
            val question = "tehran is capital of iran"
            tvqus.text = question
            val answer = "true"

            btncheat.setOnClickListener {

                val intent = Intent(this@MainActivity, Cheat::class.java)
                intent.putExtra("answer", answer)
                intent.putExtra("question", question)
                startActivity(intent)
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }

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
            val answer = "false"
            btncheat.setOnClickListener {
                val intent = Intent(this@MainActivity, Cheat::class.java)
                intent.putExtra("answer", answer)
                intent.putExtra("question", question)
                startActivity(intent)
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
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
            btnnext.setOnClickListener {
                thirdqus()
            }
            btnprev.setOnClickListener {
                firstqus()
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
            val answer = "false"
            btncheat.setOnClickListener {
                val intent = Intent(this@MainActivity, Cheat::class.java)
                intent.putExtra("answer", answer)
                intent.putExtra("question", question)
                startActivity(intent)
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            btnprev.setOnClickListener {
                secqus()
            }
            btnnext.setOnClickListener {
                fourthqus()
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

        }

    }

    private fun fourthqus() {
        with(binding) {
            val question = "5+9 = 14"
            tvqus.text = question
            btnnext.isEnabled = true
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            val answer = "true"
            btncheat.setOnClickListener {
                val intent = Intent(this@MainActivity, Cheat::class.java)
                intent.putExtra("answer", answer)
                intent.putExtra("question", question)
                startActivity(intent)
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
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

        }
    }

    private fun fifthqus() {

        with(binding) {
            val question = "Australia is both a country and a continent"
            tvqus.text = question
            btnnext.isEnabled = true
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            val answer = "true"
            btncheat.setOnClickListener {
                val intent = Intent(this@MainActivity, Cheat::class.java)
                intent.putExtra("answer", answer)
                intent.putExtra("question", question)
                startActivity(intent)
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
            btnprev.setOnClickListener {
                fourthqus()
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


        }


    }

    private fun sixthqus() {
        with(binding) {
            val question = "Humans have 4 senses"
            tvqus.text = question
            btnnext.isEnabled = true
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            val answer = "false"
            btncheat.setOnClickListener {
                val intent = Intent(this@MainActivity, Cheat::class.java)
                intent.putExtra("answer", answer)
                intent.putExtra("question", question)
                startActivity(intent)
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
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

        }

    }

    private fun seventhqus() {

        with(binding) {
            val question = "you need oxygen for breathing"
            tvqus.text = question
            btnnext.isEnabled = true
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            val answer = "true"
            btncheat.setOnClickListener {
                val intent = Intent(this@MainActivity, Cheat::class.java)
                intent.putExtra("answer", answer)
                intent.putExtra("question", question)
                startActivity(intent)
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
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

        }

    }

    private fun eighthqus() {
        with(binding) {
            val question = " The national flag of America has stars and stripes on it."
            tvqus.text = question
            btnnext.isEnabled = true
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            val answer = "true"
            btncheat.setOnClickListener {
                val intent = Intent(this@MainActivity, Cheat::class.java)
                intent.putExtra("answer", answer)
                intent.putExtra("question", question)
                startActivity(intent)
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
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

        }

    }

    private fun ninthqus() {
        with(binding) {
            val question = "Baby panda is bigger than a mouse after being born"
            tvqus.text = question
            btnnext.isEnabled = true
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            val answer = "false"
            btncheat.setOnClickListener {
                val intent = Intent(this@MainActivity, Cheat::class.java)
                intent.putExtra("answer", answer)
                intent.putExtra("question", question)
                startActivity(intent)
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
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

        }

    }

    private fun tenthqus() {
        with(binding) {
            val question = "The smallest particle of an element is the molecule"
            tvqus.text = question
            btnnext.isEnabled = false
            btntrue.isEnabled = true
            btnfalse.isEnabled = true
            btnprev.isEnabled = true
            val answer = "false"
            btncheat.setOnClickListener {
                val intent = Intent(this@MainActivity, Cheat::class.java)
                intent.putExtra("answer", answer)
                intent.putExtra("question", question)
                startActivity(intent)
                btntrue.isEnabled = false
                btnfalse.isEnabled = false
            }
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

        }

    }


}