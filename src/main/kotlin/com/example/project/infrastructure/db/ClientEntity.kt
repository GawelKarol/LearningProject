package com.example.project.infrastructure.db

import com.example.project.infrastructure.Character
import com.example.project.infrastructure.Skill
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "client")
class ClientEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    //@Column(nullable = false)
    //var surname: String = ""
    @Column(nullable = false)
    var charName: String = ""

    @Column(nullable = false)
    var vocation: String = ""

    @Column(nullable = false)
    var level: Int = 0

    @Column(nullable = false)
    var skillType: String = ""

    @Column(nullable = false)
    var skillLevel: Int = 0

    constructor(character: Character, charName: String) : this() {
        this.vocation = character.vocation
        this.level = character.level
        this.skillType = character.skill.type
        this.skillLevel = character.skill.level
        this.charName = charName
    }
    fun toCharacter(): Character{
        val character = Character(
            vocation,
            level,
            Skill(skillType,skillLevel),
            listOf(),
            listOf(),
        )
        return character
    }
}