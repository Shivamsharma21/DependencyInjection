package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor( val engine: Engine, val wheel: Wheel) {
    fun getEngine(){
        val ratio = engine.power().toString()
        Log.d("Engine->",ratio)
    }
    fun getWheel(){
        Log.d("Wheel->",wheel.brand().toString())
    }
}