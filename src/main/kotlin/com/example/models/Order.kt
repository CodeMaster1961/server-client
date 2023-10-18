package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Order(val number: String, val contents: List<OrderItem>)

@Serializable
data class OrderItem(val item: String, val amount: Int, val price: Double)

val orderStorage = listOf(Order(
    "2020-04-06-01", listOf(
        OrderItem("Ham Sandwich", 2, 5.50),
        OrderItem("Water", 1, 1.50),
        OrderItem("Beer", 3, 2.30),
        OrderItem("Cheesecake", 1, 3.75)
    )),
    Order("2020-04-03-01", listOf(
        OrderItem("Cheeseburger", 1, 8.50),
        OrderItem("Water", 2, 1.50),
        OrderItem("Coke", 2, 1.76),
        OrderItem("Ice Cream", 1, 2.35)
    )),
    Order("2023-05-02-09", listOf(
        OrderItem("Fanta", 5, 0.80),
        OrderItem("Pasta", 10, 1.50),
        OrderItem("Chips", 20, 1.00),
        OrderItem("Cake", 5, 3.00)
    ))
)