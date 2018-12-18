package com.chezi008.testdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_material.*

class MaterialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material)
        btnRecycler.setOnClickListener {
            startActivity(Intent(this,ScrollingActivity::class.java))
        }
    }
}
