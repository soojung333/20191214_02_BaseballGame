package com.soojung.a20191214_02_baseballgame

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : BaseActivity(){

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()


}