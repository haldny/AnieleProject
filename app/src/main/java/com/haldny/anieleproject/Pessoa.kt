package com.haldny.anieleproject

data class Pessoa(val nome: String, val sobrenome: String, val enderenco: Endereco? = null)

data class Endereco(val nomeDaRua: String, val numero: Int)
