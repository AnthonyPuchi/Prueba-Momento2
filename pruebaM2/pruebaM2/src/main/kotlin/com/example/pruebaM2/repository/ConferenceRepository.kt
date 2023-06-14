package com.example.pruebaM2.repository

import com.example.pruebaM2.model.Conference
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository

interface ConferenceRepository:JpaRepository<Conference, Long> {
    fun findById(id: Long?):Conference?

    

}