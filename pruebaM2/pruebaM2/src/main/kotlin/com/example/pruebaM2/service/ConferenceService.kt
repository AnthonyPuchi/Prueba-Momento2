package com.example.pruebaM2.service

import com.example.pruebaM2.model.Conference
import com.example.pruebaM2.repository.ConferenceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class ConferenceService {

    @Autowired
    lateinit var conferenceRepository: ConferenceRepository

    fun list(): List<Conference>{
        return conferenceRepository.findAll()
    }

    fun save(conference: Conference):Conference{
        return conferenceRepository.save(conference)
    }
}