package com.example.springbootfileupload.entity

import org.springframework.data.jpa.repository.JpaRepository

interface PictureRepository :JpaRepository<Picture,Long> {
}