package com.example.project.infrastructure

data class Character (
    // charName -> biznes ID
    val vocation: String,
    val level : Int,
    val skill : Skill,
    val items: List<String>,
    val potions: List<Potion>

)
data class Skill (
    val type: String,
    val level : Int
)
data class Potion(
    val name: String,
    val power: Int
)