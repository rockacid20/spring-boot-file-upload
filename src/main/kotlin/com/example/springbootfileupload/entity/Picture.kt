package com.example.springbootfileupload.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Picture(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idx : Long,
    var fileName : String,
    var storedFilePath :String,
    var fileSize : String
)