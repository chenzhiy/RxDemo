package com.kotlin.rxdemo

import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class RegisterPresenter:BasePresenter<RegisterView>() {

    fun register(mobile:String,verifyCode:String,pwd:String){
        //业务逻辑
        val userService = UserServiceImpl()
        userService.register(mobile,verifyCode,pwd)
            .execute(object :BaseSubscriber<Boolean>(){
                override fun onNext(t: Boolean) {
                    mView.onRegisterResult(t)
                }
            })

    }
}