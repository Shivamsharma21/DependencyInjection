package com.example.dependencyinjection

import javax.inject.Inject

class Wheel @Inject constructor() {
    fun brand(){
        val from ="BridgeStone"
    }
}