package com.richardoruna.tarea2kotlin.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import com.richardoruna.tarea2kotlin.R
import com.richardoruna.tarea2kotlin.adapter.ResturanteRecyclerViewAdapter
import com.richardoruna.tarea2kotlin.entities.RestauranteEntity
import kotlinx.android.synthetic.main.fragment_mas_cercanos.*
import kotlinx.android.synthetic.main.fragment_populares.*

/**
 * A simple [Fragment] subclass.
 */
class MasCercanosFragment : Fragment() {

    lateinit var resturanteRecyclerViewAdapter : ResturanteRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mas_cercanos, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val lista = ArrayList<RestauranteEntity>()
        lista.add(
            RestauranteEntity(1, "El Buen Paladar", 1f,
                R.drawable.ic_restaurant, "Sin detalle")
        )
        lista.add(
            RestauranteEntity(2, "Cavia Restaurant", 1f,
                R.drawable.ic_restaurant, "Sin detalle")
        )
        lista.add(
            RestauranteEntity(3, "Pizza Nicola", 3f,
                R.drawable.ic_restaurant, "Sin detalle")
        )
        lista.add(
            RestauranteEntity(4, "Restaurant El Cristall", 5f,
                R.drawable.ic_restaurant, "Sin detalle")
        )
        lista.add(
            RestauranteEntity(5, "Muki Restaurante", 2f,
                R.drawable.ic_restaurant, "Sin detalle")
        )
        lista.add(
            RestauranteEntity(6, "Los Herrajes", 1f,
                R.drawable.ic_restaurant, "Sin detalle")
        )
        lista.add(
            RestauranteEntity(7, "Restaurant Huaca Brava", 3f,
                R.drawable.ic_restaurant, "Sin detalle")
        )

        resturanteRecyclerViewAdapter = ResturanteRecyclerViewAdapter(lista)
        lista_mascercano_recyclerview.adapter = resturanteRecyclerViewAdapter
        lista_mascercano_recyclerview.setHasFixedSize(true)

        lista_mascercano_recyclerview.addItemDecoration(
            DividerItemDecoration(
                getActivity(),
                DividerItemDecoration.VERTICAL
            )
        )
    }

}
