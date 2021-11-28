package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.drstrange,
                "Dr.Strange",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.thor,
                "Thor",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.ironman,
                "Iromman",
                "lorem lipsum lorem lipsum lorem lipsum"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

        }
    }
}