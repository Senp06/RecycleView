package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SuperheroAdapter (
    private val context: Context,
    private val superhero: List<Superhero>,
    val listener: (Superhero) -> Unit
        ) : RecyclerView.Adapter<SuperheroAdapter.SuperHeroViewHolder>(){

    class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view)  {

        val imgSphero = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameSphero = view.findViewById<TextView>(R.id.tv_item_name)
        val desSphero = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(superhero: Superhero, listener: (Superhero) -> Unit){
            imgSphero.setImageResource(superhero.imgSphero)
            nameSphero.text= superhero.nameSphero
            desSphero.text= superhero.desSphero
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        return SuperHeroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_superhero, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        holder.bindView(superhero[position], listener)
    }

    override fun getItemCount(): Int = superhero.size
    }

