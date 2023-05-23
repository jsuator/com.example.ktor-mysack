package com.example.plugins

import com.example.routes.spendRouting
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "192.168.1.56", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureRouting()
}

fun Application.configureRouting() {
    routing {
        spendRouting()
    }
}
