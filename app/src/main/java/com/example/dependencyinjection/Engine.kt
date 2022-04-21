package com.example.dependencyinjection

import javax.inject.Inject

class Engine @Inject constructor() {
    fun power():Int{
        return 21
    }
}