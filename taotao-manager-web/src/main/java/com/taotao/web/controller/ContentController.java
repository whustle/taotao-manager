package com.taotao.web.controller;

import com.taotao.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/content")
public class ContentController {
	@Autowired
	private ContentService contentService;
	@RequestMapping("/query/list")
	public Map<String,Object> getContentList(long categoryId, @RequestParam("page")int pageNum,@RequestParam("rows")int pageSize){
		Map<String, Object> contentList = contentService.getContentList(categoryId, pageNum, pageSize);
		return contentList;
	}
}
