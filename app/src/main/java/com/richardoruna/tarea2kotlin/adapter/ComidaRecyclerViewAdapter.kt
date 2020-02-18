package com.richardoruna.tarea2kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.richardoruna.tarea2kotlin.R
import com.richardoruna.tarea2kotlin.entities.ComidaEntity
import kotlinx.android.synthetic.main.row_item_comida.view.*

class ComidaRecyclerViewAdapter(private val comidas: List<ComidaEntity>) :
    RecyclerView.Adapter<ComidaRecyclerViewAdapter.ComidaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComidaViewHolder {
        return ComidaViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.row_item_comida,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = comidas.size

    override fun onBindViewHolder(holder: ComidaViewHolder, position: Int) {
        holder.setDataComida(comidas[position])
    }

    class ComidaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagen = itemView.imagen_imageview
        val precio = itemView.precio_textview
        val descripcionLocal = itemView.descripcion_textview

        fun setDataComida(item: ComidaEntity) {
            imagen.setImageResource(item.imagenReferencial)
            descripcionLocal.text = item.descripcion
            precio.text = "S/${item.precio}"
        }

    }

}
