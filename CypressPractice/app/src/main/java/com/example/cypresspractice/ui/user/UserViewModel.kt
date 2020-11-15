package com.example.cypresspractice.ui.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cypresspractice.data.model.User
import com.example.cypresspractice.data.repositores.user.UserDataRepository
import com.example.cypresspractice.resource.Resource
import com.example.cypresspractice.resource.Status
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(var repository: UserDataRepository) : ViewModel() {

    private val _usersResource = MutableLiveData<Resource<List<User>>>()
    val usersResource: LiveData<Resource<List<User>>>
        get() = _usersResource

    val users = repository.getData()

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                _usersResource.postValue(Resource(Status.LOADING, null, null))
                val users = repository.getUsers()
                _usersResource.postValue(Resource(Status.SUCCESS, users, null))

            } catch (t: Throwable) {
                _usersResource.postValue(Resource(Status.ERROR, null, t.message))
            }
        }
    }

    fun insertAll(userList: List<User>) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAll()
            repository.insertData(userList)
        }
    }

}