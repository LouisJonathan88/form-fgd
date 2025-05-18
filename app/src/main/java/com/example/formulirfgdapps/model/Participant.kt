package com.example.formulirfgdapps.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Participant(
    val nama: String,
    val telepon: String,
    val email: String,
    val gender: String,
    val skillset: List<String>,
    val category: String
): Parcelable
