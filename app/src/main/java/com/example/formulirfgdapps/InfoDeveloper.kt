package com.example.formulirfgdapps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class InfoDeveloper : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflate: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflate.inflate(R.layout.info_developer, container, false)
    }
}