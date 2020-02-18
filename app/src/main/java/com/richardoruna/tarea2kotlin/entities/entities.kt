package com.richardoruna.tarea2kotlin.entities

import androidx.annotation.DrawableRes

data class RestauranteEntity (
    var restauranteId: Int,
    var nombreLocal: String,
    var califificacion: Float,
    @DrawableRes
    var imagenLocal: Int, //IdRecurso
    var detalleLocal: String
)

data class ComidaEntity (
    var precio: Double,
    @DrawableRes
    var imagenReferencial: Int,
    var descripcion: String,
    var restauranteId: Int
)
