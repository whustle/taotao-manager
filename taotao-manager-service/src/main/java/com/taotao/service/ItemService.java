package com.taotao.service;

import com.github.pagehelper.PageInfo;
import com.taotao.common.util.TaotaoResult;
import com.taotao.pojo.Item;
import com.taotao.pojo.ItemDesc;
import com.taotao.pojo.ItemParamItem;

import java.util.List;
import java.util.Map;

/**
 * ItemServiceImpl class
 *
 * @author wjh
 * @date 2018/11/7
 */

public interface ItemService {
	Map<String,Object> findItems(int pageNum, int pageSize);
	TaotaoResult saveItem(Item item, ItemDesc itemDesc, ItemParamItem itemParamItem);
	TaotaoResult updateItemsStatus(List ids,Item item);
}
