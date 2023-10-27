package com.idn.doadandzikir.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

data class Artikel (
    val imageArticle: Int,
    val titleArticle: String,
    val descArticle: String
) : Parcelable