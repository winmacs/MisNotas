package com.edu.uabc.misnotas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.edu.uabc.misnotas.database.TaskEntity

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var tasks: MutableList<TaskEntity>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            tasks = ArrayList()
            getTasks()

    }
}
