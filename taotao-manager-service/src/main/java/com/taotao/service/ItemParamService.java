package com.taotao.service;

import com.taotao.common.util.TaotaoResult;
import com.taotao.pojo.ItemParam;

import java.util.List;
import java.util.Map;

/**
 * ItemParamService class
 *
 * @author wjh
 * @date 2018/11/14
 */

public interface ItemParamService {
	TaotaoResult getItemParamByItemCatId(long cid);
	TaotaoResult insertItemParam(long cid, ItemParam itemParam);
	Map<String,Object> getItemParamList(int pageNum,int pageSize);
	TaotaoResult deleteItemParams(List ids);
}
