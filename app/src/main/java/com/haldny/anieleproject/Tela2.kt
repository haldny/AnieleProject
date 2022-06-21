package com.haldny.anieleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.haldny.anieleproject.databinding.ActivityTela2Binding

class Tela2 : AppCompatActivity() {

    private lateinit var binding: ActivityTela2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTela2Binding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val lista = listOf<Pessoa>(
            Pessoa("Haldny", "Santos"),
            Pessoa("Aniele1", "Aquino1"),
            Pessoa("Aniele2", "Aquino2"),
            Pessoa("Aniele3", "Aquino3"),
            Pessoa("Aniele4", "Aquino4"),
            Pessoa("Aniele5", "Aquino5"),
            Pessoa("Aniele6", "Aquino6"),
            Pessoa("Aniele7", "Aquino7"),
            Pessoa("Aniele8", "Aquino8"),
            Pessoa("Aniele9", "Aquino9"),
            Pessoa("Aniele10", "Aquino10"),
            Pessoa("Aniele11", "Aquino11"),
            Pessoa("Aniele12", "Aquino12")
        )

        binding.myRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.myRecyclerView.adapter = AdapterCustomizado(lista)
    }
}