package com.dtp.customview

import android.app.Activity
import androidx.annotation.StringRes

fun Activity.string(@StringRes string: Int): String {
    return this.applicationContext.getString(string)
}