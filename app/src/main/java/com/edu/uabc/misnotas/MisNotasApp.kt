package com.edu.uabc.misnotas

import android.app.Application
import android.arch.persistence.room.Room
import com.edu.uabc.misnotas.database.TasksDatabase

class MisNotasApp: Application() {
    companion object {
        lateinit var database: TasksDatabase
    }
    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this,
            TasksDatabase::class.java, "tasks-db").build()
    }
}