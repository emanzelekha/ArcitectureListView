package com.mahmoud.architecturerecyclerview.simple

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.mahmoud.architecturerecyclerview.R
import com.trippl3dev.listlibrary.implementation.ListVMSub

class SecondSimpleListVM : ListVMSub<String>() {
    override fun getViewId(type: Int): Int {
        return R.layout.item_simple_layout
    }
    override fun getLayoutManager(context: Context): RecyclerView.LayoutManager {
        return LinearLayoutManager(context,RecyclerView.VERTICAL,false)
    }


    override fun fetchData() {
        super.fetchData()
        this.getListOp().setList(getDummyData2())
    }

    override fun filterCondition(value: Any, it: String): Boolean {
        return super.filterCondition(value, it)
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