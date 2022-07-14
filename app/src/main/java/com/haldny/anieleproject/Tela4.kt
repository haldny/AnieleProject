package com.haldny.anieleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import com.haldny.anieleproject.databinding.ActivityTela4Binding
import java.math.RoundingMode

class Tela4 : AppCompatActivity() {

    private lateinit var binding: ActivityTela4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTela4Binding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.buttonSimular.setOnClickListener {
            val lingText = binding.editTextLinguagens.text.toString()
            val humanasText = binding.editTextHumanas.text.toString()
            val matematicaText = binding.editTextMatematica.text.toString()
            val redText = binding.editTextRedaO.text.toString()
            val naturezaText = binding.editTextNatureza.text.toString()


            if (lingText.isNotBlank() && humanasText.isNotBlank() && matematicaText.isNotBlank() && redText.isNotBlank() && naturezaText.isNotBlank()) {

                val linguagens = lingText.toDouble()
                val humanas = humanasText.toDouble()
                val matematica = matematicaText.toDouble()
                val redacao = redText.toDouble()
                val natureza = naturezaText.toDouble()


                val resultadoSimulacao =
                    ((linguagens * 2) + (humanas) + (matematica * 4) + (redacao * 2) + (natureza * 1)) / 10
                binding.textViewSimulacao.text =
                    resultadoSimulacao.toBigDecimal().setScale(2, RoundingMode.DOWN)
                        .toString()
                    if ( resultadoSimulacao < 774.49) {

                        val alertDialogNotaCorte = AlertDialog.Builder(this@Tela4)
                            .setTitle("Que pena!")
                            .setMessage("Segundo a nota de corte 2022, você não passaria")
                            .setCancelable(false)
                            .setPositiveButton("Ok") { dialog, _ ->
                                dialog.dismiss()
                            }
                            .setNegativeButton("Cancel") { dialog, _ ->
                                dialog.dismiss()
                            }
                        alertDialogNotaCorte.show()

                    }else{

                        val alertDialogNotaCortePositiva = AlertDialog.Builder(this@Tela4)
                            .setTitle("Parabéns!!! :D")
                            .setMessage("Segundo a nota de corte 2022, VOCÊ É FERA UFPE")
                            .setCancelable(false)
                            .setPositiveButton("Ok") { dialog, _ ->
                                dialog.dismiss()
                        }
                            .setNegativeButton("Cancel") { dialog, _ ->
                                dialog.dismiss()
                        }
                        alertDialogNotaCortePositiva.show()
                }


            } else {
                val alertDialog = AlertDialog
                    .Builder(this@Tela4)
                    .setTitle("Erro")
                    .setMessage("Não existe nota vazia no ENEM")
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


















