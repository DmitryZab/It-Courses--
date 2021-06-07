package com.example.itcourses.ui.base

abstract class BasePresenter<V : BaseView>(protected val view: V) {

    open fun onViewCreate() = Unit
}
