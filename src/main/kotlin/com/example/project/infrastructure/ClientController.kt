package com.example.project.infrastructure

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/client")
class ClientController {
    private var client: Client? = null
    @PostMapping
    fun saveClient(
        @RequestBody client: Client
    ){
        this.client = client
    }
    @GetMapping
    fun returnClient(): Client?{
        return this.client
    }
}