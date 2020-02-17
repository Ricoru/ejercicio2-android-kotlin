package com.richardoruna.tarea2kotlin.entities

data class RestauranteEntity (
    var nombreLocal: String,
    var califificacion: Float,
    var imagenLocal: Int, //IdRecurso
    var detalleLocal: String
)

data class ComidaEntity (
    var precio: Double,
    var imagenReferencial: String,
    var descripcion: String
)
