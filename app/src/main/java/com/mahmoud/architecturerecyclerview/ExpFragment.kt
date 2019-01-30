package com.mahmoud.architecturerecyclerview

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*

class ExpFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_main,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        simpleList.Do { it.operation.setList(getDummyData())
            it.operation.removeItemat(0)
        }

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
}