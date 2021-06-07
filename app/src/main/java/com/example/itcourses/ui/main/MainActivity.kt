package com.example.itcourses.ui.main

import android.content.Intent
import android.widget.Button
import android.widget.Toast
import com.example.itcourses.R
import com.example.itcourses.ui.base.BaseActivity
import com.example.itcourses.ui.calclulator.CalculatorActivity
import com.example.itcourses.ui.gridList.GridListActivity
import com.example.itcourses.ui.gridList.GridListView
import com.example.itcourses.ui.list.ListActivity

class MainActivity : BaseActivity<MainView, MainPresenter>(), MainView {

    override val presenter: MainPresenter = MainPresenter(this)
    override val contentId: Int = R.layout.activity_main

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button

    override fun initViews() {
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)


        setListeners()
    }

    private fun setListeners() {
        button1.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            Toast.makeText(this, "Button 2", Toast.LENGTH_SHORT).show()
        }

        button4.setOnClickListener {
            val intent = Intent(this, GridListActivity::class.java)
            startActivity(intent)
        }
    }
}
