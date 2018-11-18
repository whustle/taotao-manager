package com.taotao.web.controller;

import com.taotao.common.util.TaotaoResult;
import com.taotao.pojo.ItemParam;
import com.taotao.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * ItemParamController class
 *
 * @author wjh
 * @date 2018/11/14
 */
@RestController
@RequestMapping("/item/param")
public class ItemParamController {
	@Autowired
	private ItemParamService itemParamService;
	@RequestMapping("/query/itemcatid/{itemCatId}")
	public TaotaoResult getItemParamByCid(@PathVariable long itemCatId){
		TaotaoResult taotaoResult= itemParamService.getItemParamByItemCatId(itemCatId);
		return taotaoResult;
	}
	@RequestMapping("/save/{itemCatId}")
	public TaotaoResult insertItemParam(@PathVariable long itemCatId, ItemParam itemParam ){
		TaotaoResult taotaoResult = itemParamService.insertItemParam(itemCatId, itemParam);
		return taotaoResult;
	}
	@RequestMapping("/list")
	public Map<String,Object> getItemParamList(@RequestParam("page")int pageNum,@RequestParam("rows")int pageSize){
		Map<String, Object> itemParamList = itemParamService.getItemParamList(pageNum, pageSize);
		return itemParamList;
	}
	@RequestMapping("/delete")
	public TaotaoResult deleteItems(@RequestBody @RequestParam("ids") List ids){
		System.out.println(ids);
		TaotaoResult taotaoResult = itemParamService.deleteItemParams(ids);
		return taotaoResult;
	}
}
