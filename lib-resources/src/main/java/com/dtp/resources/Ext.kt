package com.dtp.customview

import android.app.Activity
import android.widget.Toast
import androidx.annotation.StringRes

fun Activity.string(@StringRes string: Int): String {
    return this.applicationContext.getString(string)
}

fun Activity.showToast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}