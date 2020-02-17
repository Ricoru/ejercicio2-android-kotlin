package com.richardoruna.tarea2kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.richardoruna.tarea2kotlin.R
import com.richardoruna.tarea2kotlin.entities.RestauranteEntity
import kotlinx.android.synthetic.main.row_item_restaurante.view.*

class ResturanteRecyclerViewAdapter(private val restaurantes: ArrayList<RestauranteEntity>) :
    RecyclerView.Adapter<ResturanteRecyclerViewAdapter.RestauranteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteViewHolder {
        return RestauranteViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.row_item_restaurante,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = restaurantes.size

    override fun onBindViewHolder(holder: RestauranteViewHolder, position: Int) {
        holder.setDataRestaurante(restaurantes[position])
    }

    class RestauranteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val imagen = itemView.imagen_imageview
        val nombreLocal = itemView.nombre_local_textview
        val descripcionLocal = itemView.descripcion_local_textview
        val calificacion = itemView.calificacion_ratingbar

        init {
            itemView.setOnClickListener(this)
        }

        fun setDataRestaurante(item: RestauranteEntity) {
            nombreLocal.text = item.nombreLocal
            descripcionLocal.text = item.detalleLocal
            calificacion.rating = item.califificacion

            imagen.setImageResource(R.drawable.ic_login)
        }

        override fun onClick(p0: View?) {

        }

    }

}
