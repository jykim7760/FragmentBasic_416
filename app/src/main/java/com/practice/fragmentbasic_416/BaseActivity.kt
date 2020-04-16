package com.practice.fragmentbasic_416

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this;

    abstract fun setupEvents()
    abstract fun setValues()

}