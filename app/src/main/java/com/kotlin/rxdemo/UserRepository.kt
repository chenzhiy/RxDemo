package com.kotlin.rxdemo

import rx.Observable

//直接访问数据网络的
class UserRepository {
    fun register(mobile:String, verifyCode: String, pwd:String):Observable<BaseResp<String>>{
        return RetrofitFactory.instance.create(UserApi::class.java).register(RegisterReq(mobile,verifyCode,pwd))
    }
}