package com.example.itcourses.ui.gridList

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.itcourses.R
import com.example.itcourses.data.model.Person
import com.example.itcourses.ui.base.BaseActivity
import com.example.itcourses.ui.list.ListAdapter
import com.example.itcourses.utils.lazyUnsafe

class GridListActivity : BaseActivity<GridListView, GridListPresenter>(), GridListView
{

    override val presenter: GridListPresenter = GridListPresenter(this)
    override val contentId: Int = R.layout.activity_grid_list

    private val recyclerView: RecyclerView by lazyUnsafe { findViewById<RecyclerView>(R.id.recyclerView) }
    private val personAdapter: GridListAdapter = GridListAdapter()

    override fun initViews() {
        super.initViews()
        recyclerView.layoutManager = GridLayoutManager(this ,3)
        recyclerView.adapter = personAdapter

    }

    override fun showPersons(personList: List<Person>) {
        personAdapter.cardList = personList
        personAdapter.notifyDataSetChanged()
    }

}