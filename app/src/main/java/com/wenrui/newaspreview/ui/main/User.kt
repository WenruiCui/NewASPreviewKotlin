package com.wenrui.newaspreview.ui.main

/**
 * author:崔文睿
 * mail:cuiwenrui@meituan.com
 * Created on 2018/5/10
 */
data class User(var name: String = "", var id: Int = 0) {

    fun increaseId() {
        id++
    }

}