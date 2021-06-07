package com.example.itcourses.ui.list

import com.example.itcourses.data.resository.CarRepository
import com.example.itcourses.ui.base.BasePresenter

/**
 * @author s.timirov
 */
class ListPresenter(view: ListView): BasePresenter<ListView>(view) {

    private val carRepository: CarRepository = CarRepository()

    override fun onViewCreate() {
        super.onViewCreate()
        val carList = carRepository.getCarList()
        view.showCars(carList)
    }
}
