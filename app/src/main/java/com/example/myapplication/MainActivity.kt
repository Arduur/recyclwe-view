package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var viewAdapter: RecyclerView.Adapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista = mutableListOf<Versao>()

        lista.add(Versao("Marshmallow", 6))
        lista.add(Versao("Nougat", 7))
        lista.add(Versao("Oreo", 8))
        lista.add(Versao("Pie", 9))


        viewManager = LinearLayoutManager(this)
        viewAdapter = VersãoAdapter(lista)

        recyclerView.adapter = viewAdapter
        recyclerView.layoutManager = viewManager
    }
}
