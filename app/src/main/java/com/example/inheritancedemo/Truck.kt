package com.example.inheritancedemo

class Truck(override val brand: String,
          override val model: String,
          override val engineType: EngineType,
          override val productionYear: Int,
          override val engineCapacity: Double,
          override val enginePower: Int,
          override var owner: String,
          override var carIncidentNumb: Int,
          val towingCapacity: Int = 0)
    : Car (brand, model,engineType,productionYear, engineCapacity,enginePower, owner, carIncidentNumb) {

    override fun displayVehicleParams() {
       // println(
//            "Vecicle params: ${this.brand}, ${this.model}, owner: " +
//                    "${this.owner}, production year: ${this.productionYear}" +
//                    " engine type: ${this.engineType}, engine capacity: ${this.engineCapacity}"
//                    + "engine power: ${this.enginePower}, number of accidents: ${this.carIncidentNumb}" +
//                    "towing capacity: ${this.towingCapacity}"
            super.displayVehicleParams()
            print(" Towing capacity: ${this.towingCapacity}")
    //    )
    }

    override fun calculateInsuranceCost(): Double {
        return super.calculateInsuranceCost() * towingCapacity / 1000;
    }


    fun calculateTollCost(): Double {
        // Calculating weight category based on cargo weight
        val weightCategory = CategoriesToll.values().firstOrNull { this.towingCapacity <= it.limit }
            ?: CategoriesToll.CATEGORY_4
        // Getting cost based on weight category
        return weightCategory.getCost()
    }

}











