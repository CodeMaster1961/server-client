package com.example.models

import kotlinx.serialization.Serializable

/**
 * @author Ömer Aynaci
 * data class for storing a customer
 * the Serializble annotation generates the JSON representation that we need.
 */
@Serializable
data class Customer(val id: String, val firstName: String, val lastName: String, val email: String)

val customerStorage = mutableListOf<Customer>()