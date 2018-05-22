package com.disney.datg.android.util

import android.util.Log

class AndroidUtils {

  companion object {
    private val DEFAULT_TAG: String = "util_log"

    fun log(logValue: String) {
      Log.d(DEFAULT_TAG, logValue)
    }
  }

}