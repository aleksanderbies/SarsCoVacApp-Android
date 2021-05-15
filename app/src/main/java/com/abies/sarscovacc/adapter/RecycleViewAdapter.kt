package com.abies.sarscovacc.adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.abies.sarscovacc.DetailsActivity
import com.abies.sarscovacc.MainActivity
import com.abies.sarscovacc.R;
import com.abies.sarscovacc.data.VaccListItem
import com.abies.sarscovacc.util.inflate
import kotlinx.android.synthetic.main.item_list.view.*

class RecyclerViewAdapter (private val vaccDates : List<VaccListItem>) : RecyclerView.Adapter<RecyclerViewAdapter.SetHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SetHolder {
        val inflatedView : View = parent.inflate(R.layout.item_list, false)
        return SetHolder(inflatedView)
    }

    override fun getItemCount(): Int {
        return vaccDates.size
    }

    override fun onBindViewHolder(holder: SetHolder, position: Int) {
        val itemCard = vaccDates[position]
        holder.bindSet(itemCard)
    }

    class SetHolder(v: View) : RecyclerView.ViewHolder(v),
        View.OnClickListener{
            private var view: View = v
            private var vaccDates : VaccListItem ?= null

            init {
                v.setOnClickListener(this)
            }
            override fun onClick(v: View) {
            }

            fun bindSet(vaccDates: VaccListItem){
                this.vaccDates = vaccDates
                view.city_address.text = vaccDates.name
                view.vacDate.text = vaccDates.date
                view.quantity.text = "Liczba wolnych terminów: " + vaccDates.quantity
                view.vaccLogo.setImageResource(vaccDates.vaccineLogo)
                view.vaccinationAddr.text = vaccDates.address
                view.phoneNoToVacPoint.text = vaccDates.phone

                view.phoneNoToVacPoint.setOnClickListener{
                    var intent = Intent (view.context as Activity, DetailsActivity::class.java)

                    intent.putExtra("vacCity", vaccDates.name)
                    intent.putExtra("vacDate", vaccDates.date)
                    intent.putExtra("vacLogo", vaccDates.vaccineLogo)
                    intent.putExtra("vacAddr", vaccDates.address)
                    intent.putExtra("vacPhone", vaccDates.phone)
                    intent.putExtra("hours", vaccDates.hours)
                    
                    view.context.startActivity(intent)

                }

        }
    }
}

