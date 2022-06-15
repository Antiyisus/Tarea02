package com.example.tarea02.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.tarea02.model.Tarea02

@Dao
sealed interface Tarea02Dao{

    @Query ("SELECT * FROM TAREA02")
    fun getAllData(): LiveData<List<Tarea02>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun  addTarea02( tarea02: Tarea02)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun  updateTarea02( tarea02: Tarea02)

    @Delete
    suspend fun deleteTarea02( tarea02: Tarea02)

}