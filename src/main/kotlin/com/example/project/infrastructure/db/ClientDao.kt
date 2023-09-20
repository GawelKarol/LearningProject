package com.example.project.infrastructure.db

import org.springframework.data.jpa.repository.JpaRepository

interface ClientDao : JpaRepository<ClientEntity, Long>{
    fun findByCharName(charName: String): ClientEntity?
}