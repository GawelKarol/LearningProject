package com.example.project.infrastructure

import com.example.project.infrastructure.db.ClientDao
import com.example.project.infrastructure.db.ClientEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/character")
@RestController
class CharacterController(
    private val clientDao: ClientDao
) {

    private var character: Character? = null
    private val characters: MutableMap<String, Character> = mutableMapOf()

    @PostMapping
    fun saveCharData(@RequestBody character: Character) {
        this.character = character
   //     clientDao.save(ClientEntity().also {
   //         it.surname = "321"
   //     })
    }

    @GetMapping
    fun returnCharData(): Character? {
        return this.character
    }

    @DeleteMapping
    fun deleteCharData() {
        this.character = null
    }

    @PostMapping("/{characterName}")
    fun addCharacter(
        @PathVariable characterName: String,
        @RequestBody character: Character
    ) {
        this.characters.put(characterName, character)

        val clientEntity: ClientEntity= ClientEntity(character, characterName)

        clientDao.save(clientEntity)
    }

    @GetMapping("/allChar")
    fun returnAllCharsData(): MutableMap<String, Character> {
        return this.characters
    }

    @GetMapping("/{characterName}")
    fun returnCharsData(
        @PathVariable characterName: String
    ): Character? {
        // return this.characters.get(characterName)
        val characterEntity = clientDao.findByCharName(characterName) ?: return null

        return characterEntity.toCharacter()
    }

    /* @GetMapping("/{characterName2}")
     fun returnCharsData2(
         @PathVariable characterName: String
     ): Character? = clientDao.findByCharName(characterName)?.toCharacter() */
    }
}
