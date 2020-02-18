package com.richardoruna.tarea2kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.richardoruna.tarea2kotlin.adapter.ComidaRecyclerViewAdapter
import com.richardoruna.tarea2kotlin.entities.ComidaEntity
import kotlinx.android.synthetic.main.activity_comida.*

class ComidaActivity : AppCompatActivity() {

    lateinit var comidaRecyclerViewAdapter: ComidaRecyclerViewAdapter

    val lista = ArrayList<ComidaEntity>()
    var restauranteId = 0

    object Constante {
        const val INTENT_EXTRA_ID_RESTAURANTE = "intent_extra_restaurante_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comida)

        restauranteId = intent?.extras?.get(Constante.INTENT_EXTRA_ID_RESTAURANTE) as Int
        setData(restauranteId)

//        lista_comidas_recyclerview.addItemDecoration(
//            DividerItemDecoration(
//                this,
//                DividerItemDecoration.VERTICAL
//            )
//        )
//
//        lista_comidas_recyclerview.addItemDecoration(
//            DividerItemDecoration(
//                this,
//                DividerItemDecoration.HORIZONTAL
//            )
//        )
    }

    fun setData(restauranteId: Int) {
        lista.add(
            ComidaEntity(18.0, R.drawable.ic_plato, "Apanado de Res", 1)
        )
        lista.add(
            ComidaEntity(20.0, R.drawable.ic_plato, "Tacu Tacu", 1)
        )
        lista.add(
            ComidaEntity(30.0, R.drawable.ic_plato, "Picante de Mariscos", 2)
        )
        lista.add(
            ComidaEntity(45.0, R.drawable.ic_plato, "Chaufa de Pescados", 4)
        )
        lista.add(
            ComidaEntity(22.0, R.drawable.ic_plato, "Causa Rellena", 5)
        )
        lista.add(
            ComidaEntity(9.00, R.drawable.ic_plato, "Chupe de Camarones", 21)
        )
        lista.add(
            ComidaEntity(25.50, R.drawable.ic_plato, "Caldo de Gallina", 4)
        )
        lista.add(
            ComidaEntity(9.00, R.drawable.ic_plato, "Chuleta de Pescado", 8)
        )
        lista.add(
            ComidaEntity(9.00, R.drawable.ic_plato, "Cabrito", 6)
        )
        lista.add(
            ComidaEntity(9.00, R.drawable.ic_plato, "Carne de Res a la plancha", 5)
        )
        lista.add(
            ComidaEntity(9.00, R.drawable.ic_plato, "Chancho con champiñoes a la plancha", 17)
        )
        lista.add(
            ComidaEntity(9.00, R.drawable.ic_plato, "Pollo a la plancha", 4)
        )
        lista.add(
            ComidaEntity(9.00, R.drawable.ic_plato, "Tallarin taypa familiar", 3)
        )
        lista.add(
            ComidaEntity(9.00, R.drawable.ic_plato, "Aeropuerto Especial", 2)
        )
        lista.add(
            ComidaEntity(9.00, R.drawable.ic_plato, "Lomo Salatado", 15)
        )
        lista.add(
            ComidaEntity(9.00, R.drawable.ic_plato, "Chicharrón de Pescado", 12)
        )
        lista.add(
            ComidaEntity(9.00, R.drawable.ic_plato, "Pollo a la plancha", 14)
        )
        lista.add(
            ComidaEntity(9.00, R.drawable.ic_plato, "Alitas Fritas", 16)
        )

        lista.filter { it.restauranteId == restauranteId }.also {
            comidaRecyclerViewAdapter = ComidaRecyclerViewAdapter(it)
            lista_comidas_recyclerview.adapter = comidaRecyclerViewAdapter
        }


    }

}
