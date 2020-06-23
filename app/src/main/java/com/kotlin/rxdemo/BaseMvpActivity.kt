package com.kotlin.rxdemo

open class BaseMvpActivity<T: BasePresenter<*>>:BaseActivity(),BaseView {
    override fun showLoading() {

    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    lateinit var mPresenter: T

}