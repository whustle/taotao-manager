package com.taotao.service.impl;

import com.taotao.common.util.TaotaoResult;
import com.taotao.mapper.ItemParamMapper;
import com.taotao.pojo.ItemParam;
import com.taotao.pojo.ItemParamExample;
import com.taotao.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * ItemParamServiceImpl class
 *
 * @author wjh
 * @date 2018/11/14
 */
@Service
public class ItemParamServiceImpl implements ItemParamService {
	@Autowired
	private ItemParamMapper itemParamMapper;
	@Override
	public TaotaoResult getItemParamByItemCatId(long cid) {
		ItemParamExample itemParamExample = new ItemParamExample();
		ItemParamExample.Criteria criteria = itemParamExample.createCriteria();
		criteria.andItemCatIdEqualTo(cid);
		List<ItemParam> itemParams = itemParamMapper.selectByExampleWithBLOBs(itemParamExample);
		if(itemParams!=null&&itemParams.size()!=0){
			ItemParam itemParam = itemParams.get(0);
			return TaotaoResult.ok(itemParam);
		}
		return TaotaoResult.ok();
	}

	@Override
	public TaotaoResult insertItemParam(long cid, ItemParam itemParam) {
		Date date = new Date();
		itemParam.setCreated(date);
		itemParam.setUpdated(date);
		itemParamMapper.insert(itemParam);
		return TaotaoResult.ok();
	}
}
