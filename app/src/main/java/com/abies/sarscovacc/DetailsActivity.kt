package com.abies.sarscovacc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.item_list.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        var cityName = intent.getStringExtra("vacCity")
        var vacPointAddr= intent.getStringExtra("vacAddr")
        var vacLogo = intent.getIntExtra("vacLogo", 0)
        var vacPointPhone = intent.getStringExtra("vacPhone")
        var vacDate = intent.getStringExtra("vacDate")


        println(vacLogo)
        dateVaccination.text = vacDate
        logoVac.setImageResource(vacLogo)
        vacPointAddress.text = vacPointAddr
        city.text = cityName
        vacPointPhoneNo.text = vacPointPhone

    }
}