package com.taotao.service.impl;

import com.taotao.mapper.ItemCatMapper;
import com.taotao.pojo.ItemCat;
import com.taotao.pojo.ItemCatExample;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
@Service
public class ItemCatServiceImpl implements ItemCatService {
	@Autowired
	private ItemCatMapper itemCatMapper;
	@Override
	public List<Map<String,Object>> findItemCats(Long pid) {
		ItemCatExample itemCatExample = new ItemCatExample();
		ItemCatExample.Criteria criteria = itemCatExample.createCriteria();
		criteria.andParentIdEqualTo(pid);
		List<ItemCat> itemCats = itemCatMapper.selectByExample(itemCatExample);
		CopyOnWriteArrayList<Map<String ,Object>> list = new CopyOnWriteArrayList<>();
		for (ItemCat itemCat:itemCats
			 ) {
			ConcurrentMap<String, Object> map = new ConcurrentHashMap<>();
			map.put("id",itemCat.getId());
			map.put("text",itemCat.getName());
			map.put("state",itemCat.getIsParent()?"closed":"open");
			list.add(map);
		}
		return list;
	}
}
