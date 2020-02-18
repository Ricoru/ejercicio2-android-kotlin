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
import kotlinx.android.synthetic.main.fragment_recomendados.*

/**
 * A simple [Fragment] subclass.
 */
class RecomendadosFragment : Fragment() {

    lateinit var resturanteRecyclerViewAdapter: ResturanteRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recomendados, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val lista = ArrayList<RestauranteEntity>()
        lista.add(
            RestauranteEntity(
                15, "Commodoro", 3f,
                R.drawable.ic_restaurant, "Sin detalle"
            )
        )
        lista.add(
            RestauranteEntity(
                16, "El Hornito Trattoria", 4f,
                R.drawable.ic_restaurant, "Sin detalle"
            )
        )
        lista.add(
            RestauranteEntity(
                17, "Restaurante Doña Eli", 5f,
                R.drawable.ic_restaurant, "Sin detalle"
            )
        )
        lista.add(
            RestauranteEntity(
                18, "Restaurant La Norteña", 5f,
                R.drawable.ic_restaurant, "Sin detalle"
            )
        )
        lista.add(
            RestauranteEntity(
                19, "El Sol", 3f,
                R.drawable.ic_restaurant, "Sin detalle"
            )
        )
        lista.add(
            RestauranteEntity(
                20, "Restaurante RAYMI", 2f,
                R.drawable.ic_restaurant, "Sin detalle"
            )
        )
        lista.add(
            RestauranteEntity(
                21, "La Tranca", 5f,
                R.drawable.ic_restaurant, "Sin detalle"
            )
        )

        resturanteRecyclerViewAdapter = ResturanteRecyclerViewAdapter(lista)
        lista_recomendados_recyclerview.adapter = resturanteRecyclerViewAdapter

        lista_recomendados_recyclerview.addItemDecoration(
            DividerItemDecoration(
                getActivity(),
                DividerItemDecoration.VERTICAL
            )
        )
    }

}
