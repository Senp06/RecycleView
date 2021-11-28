package com.example.recycleview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Superhero(
    val imgSphero: Int,
    val nameSphero: String,
    val desSphero: String,
) : Parcelable

