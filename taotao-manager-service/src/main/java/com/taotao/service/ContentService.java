package com.taotao.service;


import java.util.Map;

public interface ContentService {
	Map<String,Object> getContentList(long contentCatId,int pageNum,int pageSize);
}
