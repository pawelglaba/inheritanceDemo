package com.example.inheritancedemo

enum class CategoriesToll(val limit: Double) {
        CATEGORY_1(3500.0),
        CATEGORY_2(9000.0),
        CATEGORY_3(18000.0),
        CATEGORY_4(Double.MAX_VALUE);

    // Function to get cost based on weight category
    fun getCost(): Double {
        return when (this) {
            CATEGORY_1 -> 50.0
            CATEGORY_2 -> 80.0
            CATEGORY_3 -> 100.0
            CATEGORY_4 -> 150.0
        }
    }
}