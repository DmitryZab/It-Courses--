package com.example.itcourses.ui.gridList

import com.example.itcourses.data.resository.PersonRepository
import com.example.itcourses.ui.base.BasePresenter

class GridListPresenter(view: GridListView) : BasePresenter<GridListView>(view) {

    private val personRepository : PersonRepository = PersonRepository();

    override fun onViewCreate() {
        super.onViewCreate()
        val personList = personRepository.getPersonList()
        view.showPersons(personList)
    }
}