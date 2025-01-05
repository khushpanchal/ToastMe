package com.toastlibrary

import android.content.Context
import android.widget.Toast

object ToastUtil {

    fun show(
        context: Context,
        message: String,
        lengthLong: Boolean = false
    ) {
        Toast.makeText(
            context,
            message,
            if (lengthLong) Toast.LENGTH_LONG else Toast.LENGTH_SHORT
        ).show()
    }

}
