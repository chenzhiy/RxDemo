package com.kotlin.rxdemo

open class BasePresenter<T:BaseView> {
    lateinit var mView: T
}