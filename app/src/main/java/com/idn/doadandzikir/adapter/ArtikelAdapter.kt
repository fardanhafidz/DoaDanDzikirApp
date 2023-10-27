package com.idn.doadandzikir.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.idn.doadandzikir.utills.OnItemCallback
import com.idn.doadandzikir.databinding.ItemArtikelBinding
import com.idn.doadandzikir.model.Artikel


class ArtikelAdapter : RecyclerView.Adapter<ArtikelAdapter.ArtikelViewHolder>() {

    private var listArtikel = ArrayList<Artikel>()
    private var onItemCallback: OnItemCallback? = null

    fun setData(list: List<Artikel>) {
        listArtikel.clear()
        listArtikel.addAll(list)
    }

    fun setOnItemClickCallback(onItemCallback: OnItemCallback) {
        this.onItemCallback = onItemCallback
    }

    inner class ArtikelViewHolder(val view: ItemArtikelBinding) : RecyclerView.ViewHolder(view.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ArtikelViewHolder(
        ItemArtikelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun getItemCount() = listArtikel.size

    override fun onBindViewHolder(holder: ArtikelViewHolder, position: Int) {
        val data = listArtikel[position]
        holder.view.imgArtikel.setImageResource(data.imageArticle)
        holder.itemView.setOnClickListener {
            onItemCallback?.onItemClicked(data)
        }
    }


}