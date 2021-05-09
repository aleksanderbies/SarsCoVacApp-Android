package com.abies.sarscovacc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abies.sarscovacc.adapter.RecyclerViewAdapter
import com.abies.sarscovacc.data.VaccListItem
import kotlinx.android.synthetic.main.activity_main.*
import org.jsoup.Jsoup
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        retrieveWebInfo()
    }

    private fun retrieveWebInfo(){
            thread{
                val doc = Jsoup.connect("https://szczepienia.github.io/slaskie").get()

                var vaccDates= doc.select("tbody").first()
                var rows = vaccDates.select("tr")

                val vaccDatesList = ArrayList<VaccListItem>()

                for (i in 0 .. rows.size -1){
                    var row = rows.get(i)
                    var cols = row.select("td")

                    var vaccCity = cols.get(0).text()
                    var vaccDate = cols.get(1).text()
                    var vaccQuantity = cols.get(2)
                    var vaccine = cols.get(3).text()
                    var vaccPlace = cols.get(4).text()
                    var place = vaccPlace.removePrefix("Błąd? ")

                    vaccDatesList.add(VaccListItem(vaccCity, vaccDate, "1", vaccine))
                    println(vaccCity + " " + place + " " + vaccDate + " " + vaccine)
                }

                this.runOnUiThread{
                    val recyclerViewAdapter = RecyclerViewAdapter(vaccDatesList)
                    val linearLayoutManager = LinearLayoutManager(this)

                    recyclerView.layoutManager = linearLayoutManager
                    recyclerView.adapter = recyclerViewAdapter
                }
            }
        }
    }

