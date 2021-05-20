package com.abies.sarscovacc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choose_region.*

class ChooseRegionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_region)

        var intent = Intent (this, ChooseVacActivity::class.java)

        slaskie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/slaskie")
            startActivity(intent)
        }

        zachpomorskie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/zachodniopomorskie")
            startActivity(intent)
        }

        pomorskie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/pomorskie")
            startActivity(intent)
        }

        warmmazurskie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/warminsko_mazurskie")
            startActivity(intent)
        }

        podlaskie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/podlaskie")
            startActivity(intent)
        }

        mazowieckie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/mazowieckie")
            startActivity(intent)
        }

        kujpomorskie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/kujawsko_pomorskie")
            startActivity(intent)
        }

        wielkopolskie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/wielkopolskie")
            startActivity(intent)
        }

        lubelskie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/lubelskie")
            startActivity(intent)
        }

        dolnoslaskie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/dolnoslaskie")
            startActivity(intent)
        }

        opolskie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/opolskie")
            startActivity(intent)
        }
        lodzkie.setOnClickListener {
            intent.putExtra("link", " https://szczepienia.github.io/lodzkie")
            startActivity(intent)
        }

        swietokrzyskie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/swietokrzyskie")
            startActivity(intent)
        }

        lubuskie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/lubuskie")
            startActivity(intent)
        }

        podkarpackie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/podkarpackie")
            startActivity(intent)
        }

        malopolskie.setOnClickListener {
            intent.putExtra("link", "https://szczepienia.github.io/malopolskie")
            startActivity(intent)
        }
    }
}