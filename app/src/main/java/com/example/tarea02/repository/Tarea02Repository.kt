package com.example.tarea02.repository

import androidx.lifecycle.LiveData
import com.example.tarea02.data.Tarea02Dao
import com.example.tarea02.model.Tarea02

class Tarea02Repository (private  val Tarea02Dao: Tarea02Dao) {
    val getAllData: LiveData<List<Tarea02>> = Tarea02Dao.getAllData()

    suspend fun addTarea02(tarea02: Tarea02) {
        Tarea02Dao.addTarea02(tarea02)
    }

    suspend fun updateTarea02(tarea02: Tarea02) {
        Tarea02Dao.updateTarea02(tarea02)
    }

    suspend fun deletetarea02(tarea02: Tarea02) {
        Tarea02Dao.deleteTarea02(tarea02)
    }
}
