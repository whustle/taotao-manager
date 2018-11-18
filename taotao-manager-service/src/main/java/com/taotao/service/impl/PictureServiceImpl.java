package com.taotao.service.impl;

import com.taotao.common.util.FtpUtil;
import com.taotao.common.util.IDUtils;
import com.taotao.service.PictureService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PictureServiceImpl implements PictureService {

	@Value("${FILI_UPLOAD_PATH}")
	private String FILI_UPLOAD_PATH;
	@Value("${IMAGE_BASE_URL}")
	private String IMAGE_BASE_URL;
	@Value("${FTP_SERVER_IP}")
	private String FTP_SERVER_IP;
	@Value("${FTP_SERVER_PORT}")
	private Integer FTP_SERVER_PORT;
	@Value("${FTP_SERVER_USERNAME}")
	private String FTP_SERVER_USERNAME;
	@Value("${FTP_SERVER_PASSWORD}")
	private String FTP_SERVER_PASSWORD;
	@Override
	public Map<String, Object> uploadPicture(MultipartFile uploadFile) {
		ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();
		try {
			String filePath=new DateTime().toString("/yyyy/MM/dd");
			String originalFilename = uploadFile.getOriginalFilename();
			String suffixName = originalFilename.substring(originalFilename.lastIndexOf("."));
			String newFileName=IDUtils.genImageName()+suffixName;
			boolean result = FtpUtil.uploadFile(FTP_SERVER_IP, FTP_SERVER_PORT, FTP_SERVER_USERNAME, FTP_SERVER_PASSWORD, FILI_UPLOAD_PATH, filePath, newFileName, uploadFile.getInputStream());
			if(!result){
				map.put("error",1);
				map.put("message","图片上传失败");
				return map;
			}
			String imageUrl=IMAGE_BASE_URL+filePath+"/"+newFileName;
			map.put("error",0);
			map.put("url",imageUrl);
			return map;
		} catch (IOException e) {
			e.printStackTrace();
			map.put("error",1);
			map.put("message","图片上传出现异常");
			return map;
		}
	}
}
