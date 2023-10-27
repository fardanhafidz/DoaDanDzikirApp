package com.idn.doadandzikir.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.idn.doadandzikir.R
import com.idn.doadandzikir.model.DoaDanDzikirItem

class DoaDanDzikirAdapter : RecyclerView.Adapter<DoaDanDzikirAdapter.DzikirViewHolder>() {

    private var listData = ArrayList<DoaDanDzikirItem>()

    fun setData(list: List<DoaDanDzikirItem>) {
        listData.clear()
        listData.addAll(list)
    }

    inner class DzikirViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemTitle = view.findViewById<TextView>(R.id.tv_desc)
        val itemLafadz = view.findViewById<TextView>(R.id.tv_lafadz)
        val itemTranslated = view.findViewById<TextView>(R.id.tv_terjemah)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DzikirViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa, parent, false)
    )

    override fun getItemCount(): Int = listData.size

    override fun onBindViewHolder(holder: DzikirViewHolder, position: Int) {
        holder.apply {
            itemTitle.text = listData[position].title
            itemLafadz.text = listData[position].lafadz
            itemTranslated.text = listData[position].translated
        }
    }
}
