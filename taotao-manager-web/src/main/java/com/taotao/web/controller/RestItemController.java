package com.taotao.web.controller;

import com.taotao.common.util.TaotaoResult;
import com.taotao.pojo.Item;
import com.taotao.pojo.ItemDesc;
import com.taotao.pojo.ItemParamItem;
import com.taotao.service.ItemDescService;
import com.taotao.service.ItemParamItemService;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/item")
public class RestItemController {
	@Autowired
	private ItemDescService itemDescService;
	@Autowired
	private ItemParamItemService itemParamItemService;
	@Autowired
	private ItemService itemService;
	@RequestMapping("/query/item/desc/{itemId}")
	public TaotaoResult getItemDesc(@PathVariable long itemId){
		ItemDesc itemDesc = itemDescService.getItemDescByItemId(itemId);
		return TaotaoResult.ok(itemDesc);
	}
	@RequestMapping("/param/item/query/{itemId}")
	public TaotaoResult getItemParamItem(@PathVariable long itemId){
		ItemParamItem itemParamItem = itemParamItemService.getItemParamItemByItemId(itemId);
		return TaotaoResult.ok(itemParamItem);
	}

	@RequestMapping("/delete")
	public TaotaoResult deleteItems(@RequestBody @RequestParam("ids") List ids){
		System.out.println(ids);
		Item item = new Item();
		item.setStatus((byte)3);
		TaotaoResult taotaoResult = itemService.updateItemsStatus(ids,item);
		return taotaoResult;
	}
	@RequestMapping("/instock")
	public TaotaoResult instockItems(@RequestBody @RequestParam("ids") List ids){
		System.out.println(ids);
		Item item = new Item();
		item.setStatus((byte)2);
		TaotaoResult taotaoResult = itemService.updateItemsStatus(ids,item);
		return taotaoResult;
	}
	@RequestMapping("/reshelf")
	public TaotaoResult reshelfItems(@RequestBody @RequestParam("ids") List ids){
		System.out.println(ids);
		Item item = new Item();
		item.setStatus((byte)1);
		TaotaoResult taotaoResult = itemService.updateItemsStatus(ids,item);
		return taotaoResult;
	}
}
