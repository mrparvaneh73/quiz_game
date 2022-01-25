package com.example.game_test

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.game_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()  {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firstqus()

    }


    private fun firstqus(){
        binding.btnnext.isEnabled=true
        binding.btnprev.isEnabled=false
        binding.tvqus.text="tehran is capital of iran"
        binding.btnfalse.setOnClickListener {
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false
            Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()

        }
        binding.btntrue.setOnClickListener {
            Toast.makeText(this, "correct!", Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false


        }
        binding.btnnext.setOnClickListener {
            secqus()
        }
    }

    private fun secqus(){
        binding.btnnext.setOnClickListener {
            thirdqus()
        }
        binding.btnprev.setOnClickListener {
            firstqus()
        }
            binding.btnnext.isEnabled=true
            binding.btntrue.isEnabled=true
            binding.btnfalse.isEnabled=true
            binding.btnprev.isEnabled=true
            binding.tvqus.text="paris is capital of turky"
            binding.btnfalse.setOnClickListener {
                Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show()
                binding.btntrue.isEnabled=false
                binding.btnfalse.isEnabled=false
            }
            binding.btntrue.setOnClickListener {
                Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
                binding.btntrue.isEnabled=false
                binding.btnfalse.isEnabled=false
            }


    }

    private fun thirdqus(){
        binding.btnnext.isEnabled=true
        binding.btntrue.isEnabled=true
        binding.btnfalse.isEnabled=true
        binding.btnprev.isEnabled=true
       binding.btnprev.setOnClickListener{
           secqus()
       }
        binding.btnnext.setOnClickListener {
            forthqus()
        }
        binding.tvqus.text="Is China the largest country in the world?"
        binding.btnfalse.setOnClickListener {
            Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false
        }
        binding.btntrue.setOnClickListener {
            Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false
        }

    }

    private fun forthqus() {
        binding.btnnext.isEnabled=true
        binding.btntrue.isEnabled=true
        binding.btnfalse.isEnabled=true
        binding.btnprev.isEnabled=true
        binding.btnprev.setOnClickListener{
            thirdqus()
        }
        binding.btnnext.setOnClickListener {
            fifthqus()
        }
        binding.tvqus.text="5+9 = 14"
        binding.btnfalse.setOnClickListener {
            Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false
        }
        binding.btntrue.setOnClickListener {
            Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false
        }

    }

    private fun fifthqus() {
        binding.btnnext.isEnabled=true
        binding.btntrue.isEnabled=true
        binding.btnfalse.isEnabled=true
        binding.btnprev.isEnabled=true
        binding.btnprev.setOnClickListener{
            forthqus()
        }
        binding.btnnext.setOnClickListener {
            sixthqus()
        }
        binding.tvqus.text="Australia is both a country and a continent"
        binding.btnfalse.setOnClickListener {
            Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false
        }
        binding.btntrue.setOnClickListener {
            Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false
        }
    }

    private fun sixthqus() {
        binding.btnnext.isEnabled=true
        binding.btntrue.isEnabled=true
        binding.btnfalse.isEnabled=true
        binding.btnprev.isEnabled=true
        binding.btnprev.setOnClickListener{
            fifthqus()
        }
        binding.btnnext.setOnClickListener {
            seventhqus()
        }
        binding.tvqus.text="Humans have 4 senses"
        binding.btnfalse.setOnClickListener {
            Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false
        }
        binding.btntrue.setOnClickListener {
            Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false
        }
    }

    private fun seventhqus() {
        binding.btnnext.isEnabled=true
        binding.btntrue.isEnabled=true
        binding.btnfalse.isEnabled=true
        binding.btnprev.isEnabled=true
        binding.btnprev.setOnClickListener{
            sixthqus()
        }
        binding.btnnext.setOnClickListener {
            eighthqus()
        }
        binding.tvqus.text="you need oxygen for breathing"
        binding.btnfalse.setOnClickListener {
            Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false
        }
        binding.btntrue.setOnClickListener {
            Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false
        }
    }

    private fun eighthqus() {
        binding.btnnext.isEnabled=true
        binding.btntrue.isEnabled=true
        binding.btnfalse.isEnabled=true
        binding.btnprev.isEnabled=true
        binding.btnprev.setOnClickListener{
            seventhqus()
        }
        binding.btnnext.setOnClickListener {
            ninthqus()
        }
        binding.tvqus.text=" The national flag of America has stars and stripes on it."
        binding.btnfalse.setOnClickListener {
            Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false
        }
        binding.btntrue.setOnClickListener {
            Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false

        }
    }

    private fun ninthqus() {
        binding.btnnext.isEnabled=true
        binding.btntrue.isEnabled=true
        binding.btnfalse.isEnabled=true
        binding.btnprev.isEnabled=true
        binding.btnprev.setOnClickListener{
            eighthqus()
        }
        binding.btnnext.setOnClickListener {
            tenthqus()
        }
        binding.tvqus.text="Baby panda is bigger than a mouse after being born"
        binding.btnfalse.setOnClickListener {
            Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false

        }
        binding.btntrue.setOnClickListener {
            Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false

        }
    }

    private fun tenthqus() {
        binding.btnnext.isEnabled=false
        binding.btntrue.isEnabled=true
        binding.btnfalse.isEnabled=true
        binding.btnprev.isEnabled=true
        binding.btnprev.setOnClickListener{
            ninthqus()
        }

        binding.tvqus.text="The smallest particle of an element is the molecule"
        binding.btnfalse.setOnClickListener {
            Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false

        }
        binding.btntrue.setOnClickListener {
            Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
            binding.btntrue.isEnabled=false
            binding.btnfalse.isEnabled=false
        }
    }


}