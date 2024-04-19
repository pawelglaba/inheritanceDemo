package com.example.inheritancedemo

open class Car(override val brand: String,
               override val model: String,
               override val engineType: EngineType,
               override val productionYear: Int,
               override val engineCapacity: Double,
               override val enginePower: Int,
               open var owner: String="Unknown",
               open var carIncidentNumb: Int = 0)
    : Vehicle(brand, model,engineType,productionYear, engineCapacity,enginePower) {

    override fun displayVehicleParams() {
//        println("Vecicle params: ${this.brand}, ${this.model}, owner: " +
//                "${this.owner}, production year: ${this.productionYear}" +
//                " engine type: ${this.engineType}, engine capacity: ${this.engineCapacity}"
//                + "engine power: ${this.enginePower}, number of accidents: ${this.carIncidentNumb}")
        super.displayVehicleParams()
        print(" Owner: ${this.owner}, number of accidents: ${this.carIncidentNumb}")
    }

   override fun changeOwner(newOwner: String){
        this.owner=newOwner
    }

    override fun changeNumbOfAccidents(){
        this.carIncidentNumb+=1
    }

    fun changeNumbOfAccidents(newNumber: Int){
        this.carIncidentNumb=newNumber
    }

    open fun calculateInsuranceCost(): Double {
        val baseInsuranceCost = 5*this.enginePower
        val carParameterCoefficient = 0.1*(this.engineCapacity/1000) // Coefficient depending on car parameters
        val driverClaimsCoefficient = 1.5*this.carIncidentNumb // Coefficient depending on driver claims

        val insuranceCost = baseInsuranceCost + (baseInsuranceCost * carParameterCoefficient) +
                (baseInsuranceCost * driverClaimsCoefficient)
        return insuranceCost
    }



}