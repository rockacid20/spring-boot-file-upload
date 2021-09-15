package com.example.springbootfileupload.service

import com.example.springbootfileupload.entity.PictureDTO
import com.example.springbootfileupload.entity.PictureRepository
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.io.File
import java.util.*

@Service
class PictureServiceImpl(
    val pictureRepository: PictureRepository
):PictureService {
    override fun savePicture(files: List<MultipartFile>){
//        var list: List<PictureDTO> = ArrayList<PictureDTO>()
        files.forEach{ i ->
            var dto = PictureDTO(UUID.randomUUID().toString(),i.originalFilename!!,i.contentType!!)
            var file = File("${dto.uuid}_${dto.fileName}")
            i.transferTo(file)
            pictureRepository.save(dto.toEntity(i.size,"${dto.uuid}_${dto.fileName}"))
        }
    }
}