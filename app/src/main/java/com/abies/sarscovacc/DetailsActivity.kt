package com.abies.sarscovacc

import android.content.Intent
import android.net.Uri
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
        var vaccHours = intent.getStringExtra("hours")

        println(vacLogo)
        dateVaccination.text = vacDate
        logoVac.setImageResource(vacLogo)
        vacPointAddress.text = vacPointAddr
        city.text = cityName
        vacPointPhoneNo.text = vacPointPhone
        vaccinationHours.text = vaccHours

        nationalVacNo.setOnClickListener {
            var callto989 = Intent(Intent.ACTION_DIAL, Uri.parse("tel:989"))
            startActivity(callto989)
        }

        vacPointPhoneNo.setOnClickListener {
            var calltoVacPoint = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + vacPointPhone))
            startActivity(calltoVacPoint)
        }

        e_zdrowie.setOnClickListener {
            var openBrowser = Intent(Intent.ACTION_VIEW, Uri.parse("https://pacjent.erejestracja.ezdrowie.gov.pl/auth"))
            startActivity(openBrowser)
        }
    }
}