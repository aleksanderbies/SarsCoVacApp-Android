package com.abies.sarscovacc.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
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
        }
    }
}

