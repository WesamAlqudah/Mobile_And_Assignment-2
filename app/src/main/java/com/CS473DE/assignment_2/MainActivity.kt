package com.CS473DE.assignment_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val mOrders=ArrayList<String>()
    lateinit var tv_order: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initTheOrders()
        tv_order=findViewById(R.id.tv_order)
    }

    private fun initTheOrders() {
        mOrders.add("Hamburger")
        mOrders.add("stack")
        mOrders.add("fish")
        mOrders.add("sallat")
        mOrders.add("chess")
        mOrders.add("shawermma")
    }

    fun addFood(view: View) {

        val edt_add=findViewById<EditText>(R.id.edt_add)
        mOrders.add(edt_add.text.toString())
    }
    fun decide(view: View) {

        var order =mOrders.random()
        tv_order.text=order

    }
}