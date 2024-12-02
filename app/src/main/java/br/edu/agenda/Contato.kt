package br.edu.agenda

data class Contato(
    var id: Long = 0,
    var nome: String,
    var fone: String,
    var endereco: String,
    var cidade: String
)
