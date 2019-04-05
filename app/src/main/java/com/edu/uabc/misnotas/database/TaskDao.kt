package com.edu.uabc.misnotas.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query

@Dao
interface TaskDao {
    @Query("SELECT * FROM task_entity")
    fun getAllTasks(): MutableList<TaskEntity>
}