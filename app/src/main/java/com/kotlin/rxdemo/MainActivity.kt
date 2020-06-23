package com.kotlin.rxdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRegisterBtn.setOnClickListener {
            mPresenter = RegisterPresenter()
            mPresenter.mView = this

            mPresenter.register(
                mMobileEt.text.toString(),
                mVerifyCodeEt.text.toString(),
                mPwdEt.text.toString()
            )
        }
    }

    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }

}