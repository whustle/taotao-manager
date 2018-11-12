package com.taotao.web.controller;

import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * ItemCatController class
 *
 * @author wjh
 * @date 2018/11/8
 */

@RestController
@RequestMapping("/item/cat")
public class ItemCatController {
	@Autowired
	private ItemCatService itemCatService;
	@RequestMapping("/list")
	public List<Map<String, Object>> categoryList(@RequestParam(value = "id",defaultValue = "0")Long pid){
		List<Map<String, Object>> itemCats = itemCatService.findItemCats(pid);
		return itemCats;
	}
}

