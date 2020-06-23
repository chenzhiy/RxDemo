package com.kotlin.rxdemo

class BaseResp<out T>(val status:Int,val msg:String,val data:T) {

}