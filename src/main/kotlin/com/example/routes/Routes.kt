package com.example.routes

import com.example.model.Spend
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Route.spendRouting() {
    route("/spends") {

        get {
            call.respond(
                listOf(
                    Spend("1", 3434, "Paypal"),
                    Spend("2", 4000, "Mcdonald"),
                    Spend("3", 4000000, "Chaletazo Josea"),
                    Spend("3", 53, "Compra cardano"),
                    Spend("1", 3434, "Paypal"),
                    Spend("2", 4000, "Mcdonald"),
                    Spend("3", 4000000, "Chaletazo Josea"),
                    Spend("3", 53, "Compra cardano"),
                    Spend("1", 3434, "Paypal"),
                    Spend("2", 4000, "Mcdonald"),
                    Spend("3", 4000000, "Chaletazo Josea"),
                    Spend("3", 53, "Compra cardano"),
                    Spend("1", 3434, "Paypal"),
                    Spend("2", 4000, "Mcdonald"),
                    Spend("3", 4000000, "Chaletazo Josea"),
                    Spend("3", 53, "Compra cardano"),
                    Spend("1", 3434, "Paypal"),
                    Spend("2", 4000, "Mcdonald"),
                    Spend("3", 4000000, "Chaletazo Josea"),
                    Spend("3", 53, "Compra cardano"),  Spend("1", 3434, "Paypal"),
                    Spend("2", 4000, "Mcdonald"),
                    Spend("3", 4000000, "Chaletazo Josea"),
                    Spend("3", 53, "Compra cardano")

                )
            )
        }
    }


}

