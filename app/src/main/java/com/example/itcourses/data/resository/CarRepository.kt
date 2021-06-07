package com.example.itcourses.data.resository

import android.graphics.Color
import com.example.itcourses.data.model.Car

/**
 * @author s.timirov
 */
class CarRepository {

    fun getCarList(): List<Car> {
        return listOf(
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
            Car(color = Color.CYAN, name = "Kia"),
        )
    }
}
