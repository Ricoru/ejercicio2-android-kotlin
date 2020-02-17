package com.richardoruna.tarea2kotlin.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.richardoruna.tarea2kotlin.R
import com.richardoruna.tarea2kotlin.adapter.ResturanteRecyclerViewAdapter
import com.richardoruna.tarea2kotlin.entities.RestauranteEntity
import kotlinx.android.synthetic.main.fragment_mas_cercanos.*

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
            RestauranteEntity("Mi Restaurant 1", 1f,
                R.drawable.ic_login, "Sin detalle")
        )
        lista.add(
            RestauranteEntity("Mi Restaurant 2", 1f,
                R.drawable.ic_login, "Sin detalle")
        )
        lista.add(
            RestauranteEntity("Mi Restaurant 3", 3f,
                R.drawable.ic_login, "Sin detalle")
        )
        lista.add(
            RestauranteEntity("Mi Restaurant 4", 5f,
                R.drawable.ic_login, "Sin detalle")
        )
        lista.add(
            RestauranteEntity("Mi Restaurant 5", 2f,
                R.drawable.ic_login, "Sin detalle")
        )
        lista.add(
            RestauranteEntity("Mi Restaurant 6", 1f,
                R.drawable.ic_login, "Sin detalle")
        )
        lista.add(
            RestauranteEntity("Mi Restaurant 7", 3f,
                R.drawable.ic_login, "Sin detalle")
        )

        resturanteRecyclerViewAdapter = ResturanteRecyclerViewAdapter(lista)
        lista_mascercano_recyclerview.adapter = resturanteRecyclerViewAdapter
    }

}
