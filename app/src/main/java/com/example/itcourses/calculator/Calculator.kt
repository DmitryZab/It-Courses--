package com.example.itcourses.calculator

interface Calculator {

    fun sub(num1: Double, num2: Double): Double

    fun sum(num1: Double, num2: Double): Double

    fun div(num1: Double, num2: Double): Double

    fun mult(num1: Double, num2: Double): Double
}

class CalculatorImpl : Calculator {

    override fun sub(num1: Double, num2: Double): Double = num1 - num2

    override fun sum(num1: Double, num2: Double): Double = num1 + num2

    override fun div(num1: Double, num2: Double): Double = num1 / num2

    override fun mult(num1: Double, num2: Double): Double = num1 * num2
}
