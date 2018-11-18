package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.ContentMapper;
import com.taotao.pojo.Content;
import com.taotao.pojo.ContentExample;
import com.taotao.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ContentServiceImpl implements ContentService {
	@Autowired
	private ContentMapper contentMapper;
	@Override
	public Map<String, Object> getContentList(long contentCatId,int pageNum,int pageSize) {
		ContentExample contentExample = new ContentExample();
		if(contentCatId!=0){
			ContentExample.Criteria criteria = contentExample.createCriteria();
			criteria.andCategoryIdEqualTo(contentCatId);
		}
		PageHelper.startPage(pageNum,pageSize);
		List<Content> contents = contentMapper.selectByExample(contentExample);
		PageInfo<Content> info=new PageInfo<>(contents);
		ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();
		map.put("total",info.getTotal());
		map.put("rows",contents);
		return map;
	}
}
