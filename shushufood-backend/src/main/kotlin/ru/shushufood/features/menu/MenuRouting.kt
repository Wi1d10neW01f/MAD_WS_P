package ru.shushufood.features.menu

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ru.shushufood.cache.InMemoryCache
import ru.shushufood.cache.TokenCache
import java.util.*


fun Application.configureMenuRouting() {

    routing {
        post("/menu/search") {
                val menuController = MenuController(call)
                menuController.performSearch()

        }

        post("/menu/create"){
            val menuController = MenuController(call)
            menuController.createMenu()
        }
    }
}