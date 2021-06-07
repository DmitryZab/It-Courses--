package com.example.itcourses.ui.calclulator

import com.example.itcourses.ui.base.BaseView

interface CalculatorView : BaseView {
    var resultStroke : String
    var operation : String

    fun clear()

    fun addStroke(text: String)

    fun calculate()

    fun showInputText(text: String)

    fun showAnswerText(text: String)
}
