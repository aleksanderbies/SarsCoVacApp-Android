package com.abies.sarscovacc

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choose_vac.*

class ChooseVacActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_vac)

        var link = intent.getStringExtra("link")

        var intent = Intent (this, MainActivity::class.java)
        var vaccine = ""

        pfizer.setOnClickListener {
            vaccine = "Pfizer"
            intent.putExtra("vaccineName", vaccine)
            intent.putExtra("link", link)
            startActivity(intent)
        }
        moderna.setOnClickListener{
            vaccine = "Moderna"
            intent.putExtra("vaccineName", vaccine)
            intent.putExtra("link", link)
            startActivity(intent)
        }
        jj.setOnClickListener{
            vaccine="J & J"
            intent.putExtra("vaccineName", vaccine)
            intent.putExtra("link", link)
            startActivity(intent)
        }
        astra.setOnClickListener{
            vaccine="AstraZeneca"
            intent.putExtra("vaccineName", vaccine)
            intent.putExtra("link", link)
            startActivity(intent)
        }

        allVaccines.setOnClickListener {
            intent.putExtra("vaccineName", "")
            intent.putExtra("link", link)
            startActivity(intent)
        }
    }
}