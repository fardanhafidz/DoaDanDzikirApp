package com.idn.doadandzikir.utills

import com.idn.doadandzikir.model.Artikel

interface OnItemCallback {
    fun onItemClicked(item: Artikel)
}