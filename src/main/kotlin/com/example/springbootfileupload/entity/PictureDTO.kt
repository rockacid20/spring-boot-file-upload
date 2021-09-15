package com.example.springbootfileupload.entity

data class PictureDTO(
    var uuid:String,
    var fileName : String,
    var contentType : String
){
    fun toEntity(size: Long, path:String):Picture{
        return Picture(0,fileName,path,size.toString())
    }
}