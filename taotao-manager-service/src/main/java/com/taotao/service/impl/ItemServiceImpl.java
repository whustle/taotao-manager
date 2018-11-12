package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.util.IDUtils;
import com.taotao.common.util.TaotaoResult;
import com.taotao.mapper.ItemDescMapper;
import com.taotao.mapper.ItemMapper;
import com.taotao.pojo.Item;
import com.taotao.pojo.ItemDesc;
import com.taotao.pojo.ItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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
@Transactional
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemMapper itemMapper;
	@Autowired
	private ItemDescMapper itemDescMapper;
	@Override
	public Map<String,Object> findItems(int pageNum, int pageSize) {
		ItemExample itemExample = new ItemExample();
		PageHelper.startPage(pageNum,pageSize);
		List<Item> items = itemMapper.selectByExample(itemExample);
		PageInfo<Item> info = new PageInfo<>(items);
		Map<String ,Object> map=new ConcurrentHashMap<>();
		map.put("total",info.getTotal());
		map.put("rows",items);
		return map;
	}

	@Override
	public TaotaoResult saveItem(Item item,String desc,String itemParams) {
		Date date = new Date();
		//获得商品id
		long id = IDUtils.genItemId();
		//添加商品信息
		item.setId(id);
		//商品状态，1-正常，2-下架，3-删除
		item.setStatus((byte) 1);
		item.setCreated(date);
		item.setUpdated(date);
		itemMapper.insert(item);
		saveItemDesc(id,date,desc);

		return TaotaoResult.ok();
	}
	public void saveItemDesc(long id,Date date,String desc){
		ItemDesc itemDesc = new ItemDesc();
		//获得一个商品id
		itemDesc.setItemId(id);
		itemDesc.setItemDesc(desc);
		itemDesc.setCreated(date);
		itemDesc.setUpdated(date);
		//插入数据
		itemDescMapper.insert(itemDesc);
	}
}
