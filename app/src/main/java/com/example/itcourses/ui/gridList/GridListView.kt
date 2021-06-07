package com.example.itcourses.ui.gridList

import com.example.itcourses.data.model.Person
import com.example.itcourses.ui.base.BaseView

interface GridListView : BaseView{
    fun showPersons(personList: List<Person>)
}