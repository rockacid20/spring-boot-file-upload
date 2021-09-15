package com.example.springbootfileupload.controller

import com.example.springbootfileupload.service.PictureService
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile


@RestController
class PictureController(
    val pictureService: PictureService
) {


    @PostMapping("/picture")
    fun uploadPicture(
        @RequestParam("files") files:List<MultipartFile>
    ) : String{
        pictureService.savePicture(files)
        return "result"
    }

}