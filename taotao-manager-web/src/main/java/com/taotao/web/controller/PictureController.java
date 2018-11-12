package com.taotao.web.controller;

import com.taotao.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/pic")
public class PictureController {

	@Autowired
	private PictureService pictureService;

	@RequestMapping("/upload")
	public Map<String,Object> uploda(MultipartFile uploadFile) throws Exception {
		//调用service上传图片
		Map<String, Object> map = pictureService.uploadPicture(uploadFile);
		//返回上传结果
		return map;
	}
}
