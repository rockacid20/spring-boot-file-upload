package com.example.springbootfileupload.service

import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
interface PictureService {
    fun savePicture(files: List<MultipartFile>)
}