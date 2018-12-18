package com.chezi008.testdemo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.chezi008.testdemo.adapter.SimpleAdater
import kotlinx.android.synthetic.main.activity_scrolling.*

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        var list = ArrayList<String>()
        for (i in 0..20){
            list.add("index:$i")
        }
        var adater = SimpleAdater(list,R.layout.item_sample)
        recyclerView.adapter = adater
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
