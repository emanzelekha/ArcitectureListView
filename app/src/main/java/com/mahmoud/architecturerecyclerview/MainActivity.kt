package com.mahmoud.architecturerecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.trippl3dev.listlibrary.customview.ArchitectureListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sample)

//        simpleList.init(supportFragmentManager,object : ArchitectureListView.OnListReady {
//            override fun onListReady() {

//            }
//        })

//        simpleList2.init(supportFragmentManager)

    }

    override fun onResume() {
        super.onResume()
//        simpleList.listHelper!!.operation.setList(getDummyData())
    }

    fun getDummyData():List<String>{
        val list = ArrayList<String>()
        list.add("Mahmoud")
        list.add("Ahmed")
        list.add("Ali")
        list.add("Ahlam")
        list.add("Mahmoud")
        list.add("Fekry")
        list.add("Mahmoud")
        list.add("Ahmed")
        list.add("Ali")
        list.add("Ahlam")
        list.add("Mahmoud")
        list.add("Fekry")
        list.add("Mahmoud")
        list.add("Ahmed")
        list.add("Ali")
        list.add("Ahlam")
        list.add("Mahmoud")
        list.add("Fekry")
        list.add("Mahmoud")
        list.add("Ahmed")
        list.add("Ali")
        list.add("Ahlam")
        list.add("Mahmoud")
        list.add("Fekry")
        return list
    }

    fun getDummyData2():List<String>{
        val list = ArrayList<String>()
        list.add("Mahmoud2")
        list.add("Ahmed2")
        list.add("Ali2")
        list.add("Ahlam2")
        list.add("Mahmoud2")
        list.add("Fekry2")
        list.add("Mahmoud2")
        list.add("Ahmed2")
        list.add("Ali2")
        list.add("Ahlam2")
        list.add("Mahmoud2")
        list.add("Fekry2")
        list.add("Mahmoud2")
        list.add("Ahmed2")
        list.add("Ali2")
        list.add("Ahlam2")
        list.add("Mahmoud2")
        list.add("Fekry2")
        list.add("Mahmoud2")
        list.add("Ahmed2")
        list.add("Ali2")
        list.add("Ahlam2")
        list.add("Mahmoud2")
        list.add("Fekry2")
        list.add("Mahmoud2")
        list.add("Ahmed2")
        list.add("Ali2")
        list.add("Ahlam2")
        list.add("Mahmoud2")
        list.add("Fekry2")
        list.add("Mahmoud2")
        list.add("Ahmed2")
        list.add("Ali2")
        list.add("Ahlam2")
        list.add("Mahmoud2")
        list.add("Fekry2")
        list.add("Mahmoud2")
        list.add("Ahmed2")
        list.add("Ali2")
        list.add("Ahlam2")
        list.add("Mahmoud2")
        list.add("Fekry2")
        return list
    }
}
