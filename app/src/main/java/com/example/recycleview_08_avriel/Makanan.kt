package com.example.recycleview_08_avriel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Makanan(
    val imgMakanan:Int,
    val nameMakanan: String,
    val descMakanan: String
    ) : Parcelable
