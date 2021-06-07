package com.example.itcourses.ui.gridList

import android.app.Person
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.itcourses.R
import com.example.itcourses.ui.list.ListAdapter

class GridListAdapter : RecyclerView.Adapter<GridListAdapter.PersonViewHolder>() {

    var cardList : List<com.example.itcourses.data.model.Person> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.textView.text = cardList[position].name
        holder.textViewSurname.text = cardList[position].surname
        //почему то не выводит
        holder.textViewAge.text = cardList[position].age.toString()
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    inner class PersonViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.personNameTextView)
        val textViewSurname : TextView = view.findViewById(R.id.personSurNameTextView)
        val textViewAge : TextView = view.findViewById(R.id.personAgeTextView)
    }

}