package com.haldny.anieleproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.haldny.anieleproject.databinding.ItemPessoaBinding

class AdapterCustomizado(val pessoas: List<Pessoa>)
    : RecyclerView.Adapter<AdapterCustomizado.MyViewHolder>() {


    inner  class MyViewHolder(val binding: ItemPessoaBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(pessoa: Pessoa) {
            binding.textViewNome.text = pessoa.nome
            binding.textViewSobrenome.text = pessoa.sobrenome
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemPessoaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(pessoas[position])
    }

    override fun getItemCount(): Int = pessoas.size

}
