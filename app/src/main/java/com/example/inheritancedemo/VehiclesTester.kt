package com.example.inheritancedemo

fun main() {
   // val newVehicle = Vehicle("Audi","A6", EngineType.DIESEL,2020,,1996,204)

    val newCar = Car("Audi","A6", EngineType.DIESEL,2020,
        1996.3,204, "Pawel Glaba", 0)

    println("insurance cost: ${newCar.calculateInsuranceCost()}")

    newCar.changeNumbOfAccidents(2)

    println("New insurance cost: ${newCar.calculateInsuranceCost()}")

    val newTruck = Truck ("Volvo","FH550", EngineType.DIESEL,2024,
        9150.33,550, "Pawel Glaba", 0, 40000)

    println("insurance cost for truck: ${newTruck.calculateInsuranceCost()}")

    println("Toll cost: ${newTruck.calculateTollCost()}")



}