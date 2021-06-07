package com.example.itcourses.ui.list

import com.example.itcourses.data.model.Car
import com.example.itcourses.ui.base.BaseView

/**
 * @author s.timirov
 */
interface ListView: BaseView {

    fun showCars(carList: List<Car>)
}
