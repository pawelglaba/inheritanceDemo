package com.example.inheritancedemo

import java.util.Calendar

 abstract class Vehicle(brand:String, model:String,  engineType: EngineType, productionYear: Int,
    engineCapacity: Double, enginePower: Int) : VehicleInterface {

    abstract val brand: String?
    abstract val model: String?
    abstract val productionYear: Int?
    abstract val engineType: EngineType?
    abstract val engineCapacity: Double?
    abstract val enginePower: Int?

    override fun getVehicleAge(): Int {
        val calendar = Calendar.getInstance()
        val currentYear = calendar.get(Calendar.YEAR)
        val age = currentYear-this.productionYear!!
        return age
    }
    override fun displayVehicleParams() {
        println("Vecicle params: ${this.brand}, ${this.model}, production year: ${this.productionYear}" +
                " engine type: ${this.engineType}, engine capacity: ${this.engineCapacity}"
        + "engine power: ${this.enginePower}")
    }

}