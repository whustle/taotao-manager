package com.taotao.service.impl;

import com.github.pagehelper.PageInfo;
import com.taotao.mapper.ItemMapper;
import com.taotao.pojo.Item;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public PageInfo<Item> findItems(int pageNum, int pageSize) {
		return null;
	}
}
