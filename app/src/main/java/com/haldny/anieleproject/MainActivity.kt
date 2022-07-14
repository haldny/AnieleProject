package com.haldny.anieleproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.haldny.anieleproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.buttonTela2.setOnClickListener {
            val intent = Intent(this, Tela2::class.java)
            startActivity(intent)
        }

        binding.buttonTela3.setOnClickListener {
            val intent = Intent(this, Tela3::class.java)
            startActivity(intent)
        }
        // interação UI ao clicar no botão "ir para tela 4"
        binding.buttonTela4.setOnClickListener {
            val intent = Intent(this, Tela4::class.java)
            startActivity(intent)
        }

    }
}