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
import kotlinx.android.synthetic.main.fragment_populares.*

/**
 * A simple [Fragment] subclass.
 */
class PopularesFragment : Fragment() {

    lateinit var resturanteRecyclerViewAdapter: ResturanteRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_populares, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val lista = ArrayList<RestauranteEntity>()
        lista.add(
            RestauranteEntity(
                8, "Restaurante La Cachaca", 1f,
                R.drawable.ic_restaurant, "Sin detalle"
            )
        )
        lista.add(
            RestauranteEntity(
                9, "Restaurante El Sombrero", 1f,
                R.drawable.ic_restaurant, "Sin detalle"
            )
        )
        lista.add(
            RestauranteEntity(
                10, "Rest. La Pavita", 3f,
                R.drawable.ic_restaurant, "Sin detalle"
            )
        )
        lista.add(
            RestauranteEntity(
                11, "Trujillo Señorial", 5f,
                R.drawable.ic_restaurant, "Sin detalle"
            )
        )
        lista.add(
            RestauranteEntity(
                12, "Rincón del Vallejo", 2f,
                R.drawable.ic_restaurant, "Sin detalle"
            )
        )
        lista.add(
            RestauranteEntity(
                13, "Doña Peta", 1f,
                R.drawable.ic_restaurant, "Sin detalle"
            )
        )
        lista.add(
            RestauranteEntity(
                14, "Restaurant La Pavita", 3f,
                R.drawable.ic_restaurant, "Sin detalle"
            )
        )

        resturanteRecyclerViewAdapter = ResturanteRecyclerViewAdapter(lista)
        lista_populares_recyclerview.adapter = resturanteRecyclerViewAdapter

        lista_populares_recyclerview.addItemDecoration(
            DividerItemDecoration(
                getActivity(),
                DividerItemDecoration.VERTICAL
            )
        )
    }

}
