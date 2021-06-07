package com.example.itcourses.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<V : BaseView, P : BasePresenter<V>> : AppCompatActivity(), BaseView {

    abstract val presenter: P

    abstract val contentId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(contentId)
        initViews()
        presenter.onViewCreate()
    }

    protected open fun initViews() = Unit
}
