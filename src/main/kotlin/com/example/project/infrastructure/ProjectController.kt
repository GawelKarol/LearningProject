package com.example.project.infrastructure

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/project")
class ProjectController {
    private var message: String=""

    @PostMapping("/message")
    fun saveMessage(@RequestBody message: String){
        this.message = message
    }
    @GetMapping("/message")
    fun getMessage(): String {
        return this.message
    }

}