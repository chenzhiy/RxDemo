package com.kotlin.rxdemo

import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

interface UserApi {
    @POST("userCenter/register")
    fun register(@Body req:RegisterReq):Observable<BaseResp<String>>
}