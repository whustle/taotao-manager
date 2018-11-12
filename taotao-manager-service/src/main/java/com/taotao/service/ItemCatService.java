package com.taotao.service;

import com.taotao.pojo.ItemCat;

import java.util.List;
import java.util.Map;

/**
 * ItemCatService class
 *
 * @author wjh
 * @date 2018/11/8
 */

public interface ItemCatService {
	List<Map<String,Object>> findItemCats(Long pid);
}
