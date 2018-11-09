package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.ItemMapper;
import com.taotao.pojo.Item;
import com.taotao.pojo.ItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ItemServiceImpl class
 *
 * @author wjh
 * @date 2018/11/7
 */
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemMapper itemMapper;
	@Override
	public Map<String,Object> findItems(int pageNum, int pageSize) {
		ItemExample itemExample = new ItemExample();
		PageHelper.startPage(pageNum,pageSize);
		List<Item> items = itemMapper.selectByExample(itemExample);
		PageInfo<Item> info = new PageInfo<>(items);
		Map<String ,Object> map=new ConcurrentHashMap<>();
		map.put("total",info.getSize());
		map.put("rows",info.getList());
		return map;
	}
}
