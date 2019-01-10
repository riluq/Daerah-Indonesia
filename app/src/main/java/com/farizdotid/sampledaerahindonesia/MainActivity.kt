package com.farizdotid.sampledaerahindonesia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.farizdotid.daerahindonesia.DaerahIndonesiaHelper

class MainActivity : AppCompatActivity() {

    val TAG = "debugapp"

    private lateinit var daerahIndonesiaHelper: DaerahIndonesiaHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        daerahIndonesiaHelper = DaerahIndonesiaHelper(this)


    }
}