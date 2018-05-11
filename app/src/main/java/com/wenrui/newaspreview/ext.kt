package com.wenrui.newaspreview

import android.content.Context
import android.widget.Toast

/**
 * author:崔文睿
 * mail:cuiwenrui@meituan.com
 * Created on 2018/5/11
 */
fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
