package com.taotao.service;

import com.taotao.common.util.TaotaoResult;
import com.taotao.pojo.ItemParam;

/**
 * ItemParamService class
 *
 * @author wjh
 * @date 2018/11/14
 */

public interface ItemParamService {
	TaotaoResult getItemParamByItemCatId(long cid);
	TaotaoResult insertItemParam(long cid, ItemParam itemParam);
}
