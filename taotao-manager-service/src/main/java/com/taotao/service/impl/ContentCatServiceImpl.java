package com.taotao.service.impl;

import com.taotao.common.util.TaotaoResult;
import com.taotao.mapper.ContentCategoryMapper;
import com.taotao.pojo.ContentCategory;
import com.taotao.pojo.ContentCategoryExample;
import com.taotao.service.ContentCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class ContentCatServiceImpl implements ContentCatService {
	@Autowired
	private ContentCategoryMapper contentCategoryMapper;
	@Override
	public List<Map<String,Object>> getContentCatList(long parentId) {
		ContentCategoryExample contentCategoryExample = new ContentCategoryExample();
		ContentCategoryExample.Criteria criteria = contentCategoryExample.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		criteria.andStatusEqualTo(1);
		List<ContentCategory> contentCategories = contentCategoryMapper.selectByExample(contentCategoryExample);
		CopyOnWriteArrayList<Map<String,Object>> list = new CopyOnWriteArrayList<>();
		for (ContentCategory contentCat:contentCategories
			 ) {
			ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();
			map.put("id",contentCat.getId());
			map.put("text",contentCat.getName());
			map.put("state",contentCat.getIsParent()?"closed":"open");
			list.add(map);
		}
		return list;
	}

	@Override
	public TaotaoResult createContentCat(long parentId, String name) {
		ContentCategory contentCategory = new ContentCategory();
		Date date = new Date();
		contentCategory.setIsParent(false);
		contentCategory.setCreated(date);
		contentCategory.setUpdated(date);
		contentCategory.setName(name);
		contentCategory.setParentId(parentId);
		contentCategory.setSortOrder(1);
		contentCategory.setStatus(1);
		contentCategoryMapper.insert(contentCategory);
		ContentCategory contentCategory1 = contentCategoryMapper.selectByPrimaryKey(parentId);
		if(!contentCategory1.getIsParent()){
			contentCategory1.setIsParent(true);
			contentCategoryMapper.updateByPrimaryKey(contentCategory1);
		}
		return TaotaoResult.ok(contentCategory);
	}

	@Override
	public void updateContentCat(long id, String name) {
		ContentCategory contentCategory = new ContentCategory();
		contentCategory.setId(id);
		contentCategory.setName(name);
		contentCategoryMapper.updateByPrimaryKeySelective(contentCategory);
	}

	@Override
	public void deleteContentCat(long parentId, long id) {
		ContentCategory contentCategory = new ContentCategory();
		contentCategory.setId(id);
		contentCategory.setStatus(2);
		contentCategoryMapper.updateByPrimaryKeySelective(contentCategory);
		List<Map<String, Object>> contentCatList = getContentCatList(parentId);
		if(contentCatList.size()==0){
			ContentCategory contentCategory1 = new ContentCategory();
			contentCategory1.setId(parentId);
			contentCategory1.setIsParent(false);
			contentCategoryMapper.updateByPrimaryKeySelective(contentCategory1);
		}
	}
}
