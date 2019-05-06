package com.lunatech.vacationbot.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Ping / Pong Controller
 */
@RestController
class MessageController {
    @PostMapping("/ping")
    fun findByLastName(@RequestParam command: Map<String, String>): String {
        return "pong: " + command.get("text")
    }
}