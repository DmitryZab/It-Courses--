package com.example.itcourses.ui.calclulator

import com.example.itcourses.ui.base.BasePresenter

class CalculatorPresenter(view: CalculatorView) : BasePresenter<CalculatorView>(view) {

    fun onClearClick() {
        view.clear()
        view.showAnswerText(view.resultStroke)
        view.showInputText("")
    }

    fun onEquallyClick() {
        view.calculate()
        view.showInputText(view.resultStroke)
    }

    fun onSubClick() {
        view.addStroke("-")
        view.operation = "-"
        view.showAnswerText(view.resultStroke)
    }

    fun onSumClick() {
        view.addStroke("+")
        view.operation = "+"
        view.showAnswerText(view.resultStroke)
    }

    fun onDivClick() {
        view.addStroke("/")
        view.operation = "/"
        view.showAnswerText(view.resultStroke)
    }

    fun onMultClick() {
        view.addStroke("*")
        view.operation = "*"
        view.showAnswerText(view.resultStroke)
    }

    fun onNum1Click() {
        view.addStroke("1")
        view.showAnswerText(view.resultStroke)
    }
    fun onNum2Click() {
        view.addStroke("2")
        view.showAnswerText(view.resultStroke)
    }
    fun onNum3Click() {
        view.addStroke("3")
        view.showAnswerText(view.resultStroke)
    }
    fun onNum4Click() {
        view.addStroke("4")
        view.showAnswerText(view.resultStroke)
    }
    fun onNum5Click() {
        view.addStroke("5")
        view.showAnswerText(view.resultStroke)
    }
    fun onNum6Click() {
        view.addStroke("6")
        view.showAnswerText(view.resultStroke)
    }
    fun onNum7Click() {
        view.addStroke("7")
        view.showAnswerText(view.resultStroke)
    }
    fun onNum8Click() {
        view.addStroke("8")
        view.showAnswerText(view.resultStroke)
    }
    fun onNum9Click() {
        view.addStroke("9")
        view.showAnswerText(view.resultStroke)
    }
    fun onNum0Click() {
        view.addStroke("0")
        view.showAnswerText(view.resultStroke)
    }
}
