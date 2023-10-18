package com.example.plugins

import com.example.routes.customerRoute
import com.example.routes.getOrderRoute
import com.example.routes.listOrdersRoute
import com.example.routes.totalizeOrderRoute
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

/**
 * @author Ömer Aynaci
 * here we register the routes
 */
fun Application.configureRouting() {
    routing {
        customerRoute()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
