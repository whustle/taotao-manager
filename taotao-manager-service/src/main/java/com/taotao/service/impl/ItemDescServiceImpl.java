package com.taotao.service.impl;

import com.taotao.mapper.ItemDescMapper;
import com.taotao.pojo.ItemDesc;
import com.taotao.service.ItemDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemDescServiceImpl implements ItemDescService {
	@Autowired
	private ItemDescMapper itemDescMapper;
	@Override
	public ItemDesc getItemDescByItemId(long id) {
		ItemDesc itemDesc = itemDescMapper.selectByPrimaryKey(id);
		return itemDesc;
	}
}
