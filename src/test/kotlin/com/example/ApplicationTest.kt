package com.example

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import org.junit.Test
import kotlin.test.assertEquals

class OrderRoutesTest {

    /**
     * @author Ömer Aynaci
     * test for getting order for a specific order number
     */
    @Test
    fun testGetOrder() = testApplication {
        val response = client.get("/order/2020-04-06-01")
        assertEquals(
            """{"number":"2020-04-06-01","contents":[{"item":"Ham Sandwich","amount":2,"price":5.5},{"item":"Water","amount":1,"price":1.5},{"item":"Beer","amount":3,"price":2.3},{"item":"Cheesecake","amount":1,"price":3.75}]}""",
            response.bodyAsText()
        )
        assertEquals(HttpStatusCode.OK, response.status)
    }


    /**
     * @author Ömer Aynaci
     * test for totalizing the total of the order
     */
    @Test
    fun testTotalizeOrder() = testApplication {
        val response = client.get("/order/2020-04-06-01/total")
        assertEquals(
            23.15, response.bodyAsText().toDouble()
        )
        assertEquals(HttpStatusCode.OK, response.status)
    }
}