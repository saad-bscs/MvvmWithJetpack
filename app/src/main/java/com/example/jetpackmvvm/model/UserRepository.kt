package com.example.jetpackmvvm.model

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun fetchUserData() : UserData {
        //mock API
        delay(1000)
        return UserData("Atif Aslam", 30)
    }
}