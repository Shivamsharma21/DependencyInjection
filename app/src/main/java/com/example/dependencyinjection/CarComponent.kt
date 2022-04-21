package com.example.dependencyinjection

import dagger.Component


@Component
interface CarComponent {

   fun getCar(): Car

}