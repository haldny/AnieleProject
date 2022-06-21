package com.haldny.anieleproject

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import com.haldny.anieleproject.databinding.ActivityTela3Binding
import java.math.RoundingMode

class Tela3 : AppCompatActivity() {

    private lateinit var binding: ActivityTela3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTela3Binding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)


        binding.buttonCalcular.setOnClickListener {
            val alturaTexto = binding.editTextAltura.text.toString()
            val pesoText = binding.editTextPeso.text.toString()

            if (alturaTexto.isNotBlank() && pesoText.isNotBlank()) {

                val altura = alturaTexto.toDouble()
                val peso = pesoText.toDouble()

                val resultado = peso / (altura * altura)

                binding.textViewResultado.text = resultado
                    .toBigDecimal()
                    .setScale(2, RoundingMode.DOWN)
                    .toString()
            } else {
                val alertDialog = AlertDialog
                    .Builder(this@Tela3)
                    .setTitle("Erro")
                    .setMessage("Os campos não devem estar vazios")
                    .setCancelable(false)
                    .setPositiveButton("Ok") { dialog, _ ->
                        dialog.dismiss()
                    }
                    .setNegativeButton("Cancel") { dialog, _ ->
                        dialog.dismiss()
                    }

                alertDialog.show()
            }
        }
    }
}