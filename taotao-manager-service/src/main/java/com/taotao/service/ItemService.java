package com.taotao.service;

import com.github.pagehelper.PageInfo;
import com.taotao.pojo.Item;

/**
 * ItemServiceImpl class
 *
 * @author wjh
 * @date 2018/11/7
 */

public interface ItemService {
	PageInfo<Item> findItems(int pageNum,int pageSize);
}
