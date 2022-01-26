package com.example.game_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.game_test.databinding.ActivityCheatBinding

class Cheat : AppCompatActivity() {
    private lateinit var binding: ActivityCheatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCheatBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvanswer.visibility=View.INVISIBLE
        val intent=intent
        binding.tvquestion.text=intent.getStringExtra("question")
        binding.btnshowanswer.setOnClickListener {
          val answer=  intent.getStringExtra("answer")
            binding.tvanswer.apply {
                visibility=View.VISIBLE
                text="ANSWER IS : $answer"
            }
        }
        binding.btnback.setOnClickListener {
           val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}