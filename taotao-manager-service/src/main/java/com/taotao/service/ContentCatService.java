package com.taotao.service;

import com.taotao.common.util.TaotaoResult;

import java.util.List;
import java.util.Map;

public interface ContentCatService {
	List<Map<String,Object>> getContentCatList(long parentId);
	TaotaoResult createContentCat(long parentId,String name);
	void updateContentCat(long id,String name);
	void deleteContentCat(long parentId,long id);
}
