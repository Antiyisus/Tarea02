package com.example.tarea02.adapter

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tarea02.data.Tarea02Dao
import com.example.tarea02.model.Tarea02


@Database(entities = [Tarea02::class], version = 1, exportSchema = false)
abstract class Tarea02Database: RoomDatabase() {
    abstract fun TareaDao() : Tarea02Dao

    companion object {
        @Volatile
        private var INSTANCE: Tarea02Database? = null

        fun getDatabase(context: android.content.Context): Tarea02Database {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    Tarea02Database::class.java,
                    "tarea02_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}