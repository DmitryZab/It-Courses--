package com.example.itcourses.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.itcourses.R
import com.example.itcourses.data.model.Car

/**
 * @author s.timirov
 */
class ListAdapter: RecyclerView.Adapter<ListAdapter.CarViewHolder>() {

    var cardList: List<Car> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_car, parent, false)
        return CarViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.view.setBackgroundColor(cardList[position].color)
        holder.textView.text = cardList[position].name
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    inner class CarViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.carNameTextView)
    }
}
