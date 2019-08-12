package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.lista.view.*
import java.io.File


class VersãoAdapter (var lista : MutableList<Versao>) : RecyclerView.Adapter<VersãoAdapter. VersaoViewHolder> () {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): VersaoViewHolder {
        var view = LayoutInflater.from(p0.context).inflate(R.layout.lista,p0,false)
        return VersaoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(p0: VersaoViewHolder, p1: Int) {
        p0.nome.text = lista[p1].name
        p0.sdk.text = lista[p1].sdk.toString()
    }


    inner class VersaoViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var nome = view.nome
        var sdk = view.sdk
    }
}