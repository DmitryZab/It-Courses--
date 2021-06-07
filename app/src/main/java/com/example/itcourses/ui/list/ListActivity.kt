package com.example.itcourses.ui.list

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.itcourses.R
import com.example.itcourses.data.model.Car
import com.example.itcourses.ui.base.BaseActivity
import com.example.itcourses.utils.lazyUnsafe

class ListActivity : BaseActivity<ListView, ListPresenter>(), ListView {

    override val presenter: ListPresenter = ListPresenter(this)
    override val contentId: Int = R.layout.activity_list

    private val recyclerView: RecyclerView by lazyUnsafe { findViewById<RecyclerView>(R.id.recyclerView) }
    private val carAdapter: ListAdapter = ListAdapter()

    override fun initViews() {
        super.initViews()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = carAdapter
    }

    override fun showCars(carList: List<Car>) {
        carAdapter.cardList = carList
        carAdapter.notifyDataSetChanged()
    }
}
