package com.mahmoud.architecturerecyclerview.simple

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.mahmoud.architecturerecyclerview.R
import com.trippl3dev.listlibrary.implementation.ListVMSub

class SimpleListVM : ListVMSub<String>() {
    override fun getViewId(type: Int): Int {
        return R.layout.item_simple_layout
    }
    override fun getLayoutManager(context: Context): RecyclerView.LayoutManager {
        return LinearLayoutManager(context,RecyclerView.VERTICAL,false)
    }
}