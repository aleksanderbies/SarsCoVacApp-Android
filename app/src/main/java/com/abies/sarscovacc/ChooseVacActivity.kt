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

        allVaccines.setOnClickListener {
            var intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}