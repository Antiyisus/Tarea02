package com.example.tarea02.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.tarea02.adapter.Tarea02Database
import com.example.tarea02.model.Tarea02
import com.example.tarea02.repository.Tarea02Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Tarea02ViewModel (application: Application) : AndroidViewModel(application) {
    val getAllData: LiveData<List<Tarea02>>

    private val repository: Tarea02Repository

    init {
        val tarea02Dao = Tarea02Database.getDatabase(application).TareaDao()
        repository = Tarea02Repository(tarea02Dao)
        getAllData = repository.getAllData
    }

    fun addTarea02 (tarea02: Tarea02) {
        viewModelScope.launch(Dispatchers.IO) { repository.addTarea02(tarea02) }
    }

    fun updateTarea02 (tarea02: Tarea02) {
        viewModelScope.launch(Dispatchers.IO) { repository.updateTarea02(tarea02) }
    }

    fun deleteTarea02 (tarea02: Tarea02) {
        viewModelScope.launch(Dispatchers.IO) { repository.deletetarea02(tarea02) }
    }
}




