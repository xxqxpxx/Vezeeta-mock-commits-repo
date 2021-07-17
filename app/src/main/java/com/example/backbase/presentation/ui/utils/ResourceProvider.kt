package com.example.backbase.presentation.ui.utils

import android.content.Context
import androidx.annotation.StringRes


class ResourceProvider(private val context: Context) {

    fun getString(@StringRes resId: Int): String {
        return context.getString(resId)
    }
}
