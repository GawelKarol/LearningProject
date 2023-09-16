package com.example.project.infrastructure

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.print.DocFlavor.STRING

@RequestMapping("/character")
@RestController
class CharacterController {

    private var character: Character? = null
    private val characters: MutableMap<String, Character> = mutableMapOf()

    @PostMapping
    fun saveCharData (@RequestBody character: Character){
        this.character = character
    }

    @GetMapping
    fun returnCharData(): Character?{
        return this.character
    }

    @DeleteMapping
    fun deleteCharData(){
        this.character = null
    }

    @PostMapping("/{characterName}")
    fun addCharacter(
        @PathVariable characterName: String,
        @RequestBody character: Character){
        this.characters.put(characterName, character)

    }
    @GetMapping("/allChar")
    fun returnAllCharsData(): MutableMap<String, Character>{
        return this.characters
    }
    @GetMapping("/{characterName}")
    fun returnCharsData(
        @PathVariable characterName: String
    ): Character?{
       return this.characters.get(characterName)
    }
    }
