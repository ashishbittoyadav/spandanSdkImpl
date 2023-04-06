package com.example.spandansdkimpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import `in`.sunfox.healthcare.commons.android.spandan_sdk.SpandanSDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spandanSDK = SpandanSDK.getInstance()
    }
}