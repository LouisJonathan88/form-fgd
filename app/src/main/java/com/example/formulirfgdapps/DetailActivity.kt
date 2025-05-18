package com.example.formulirfgdapps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.formulirfgdapps.databinding.ActivityDetailBinding

import com.example.formulirfgdapps.model.Participant

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val participant = intent.getParcelableExtra<Participant>("participant")

        participant?.let{
            binding.txtNamaResult.text = it.nama
            binding.txtTeleponResult.text = it.telepon
            binding.txtEmailResult.text = it.email
            binding.txtGenderResult.text = it.gender
            binding.txtSkillsetResult.text = it.skillset.joinToString(", ")
            binding.txtKategoriResult.text = it.category
        }

        binding.btnInfoDeveloper.setOnClickListener {
            val bottomSheet = InfoDeveloper()
            bottomSheet.show(supportFragmentManager, "InfoDeveloper")
        }
    }
}