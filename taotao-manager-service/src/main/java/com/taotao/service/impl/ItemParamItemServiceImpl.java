package com.taotao.service.impl;

import com.taotao.mapper.ItemParamItemMapper;
import com.taotao.pojo.ItemParamExample;
import com.taotao.pojo.ItemParamItem;
import com.taotao.pojo.ItemParamItemExample;
import com.taotao.service.ItemParamItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemParamItemServiceImpl implements ItemParamItemService {
	@Autowired
	private ItemParamItemMapper itemParamItemMapper;
	@Override
	public ItemParamItem getItemParamItemByItemId(long id) {
		ItemParamItemExample itemParamItemExample = new ItemParamItemExample();
		ItemParamItemExample.Criteria criteria = itemParamItemExample.createCriteria();
		criteria.andItemIdEqualTo(id);
		List<ItemParamItem> itemParamItems = itemParamItemMapper.selectByExampleWithBLOBs(itemParamItemExample);
		if(itemParamItems.size()!=0){
			ItemParamItem itemParamItem = itemParamItems.get(0);
			return itemParamItem;
		}
		return null;
	}
}
