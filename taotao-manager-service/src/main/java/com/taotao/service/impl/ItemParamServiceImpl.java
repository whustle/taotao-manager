package com.taotao.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.util.ItemParamResult;
import com.taotao.common.util.JsonUtils;
import com.taotao.common.util.TaotaoResult;
import com.taotao.mapper.ItemParamMapper;
import com.taotao.pojo.ItemParam;
import com.taotao.pojo.ItemParamExample;
import com.taotao.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

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

	@Override
	public Map<String, Object> getItemParamList(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		List itemParamAndItemCat = itemParamMapper.findItemParamAndItemCat();
		PageInfo<ItemParam> info = new PageInfo<>(itemParamAndItemCat);
		ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();
		CopyOnWriteArrayList<ItemParamResult> list = new CopyOnWriteArrayList<>();
		for (int i = 0; i <itemParamAndItemCat.size() ; i++) {
			ItemParamResult re = new ItemParamResult();
			Map m = (Map)itemParamAndItemCat.get(i);
			re.setId((long)m.get("id"));
			re.setParamData((String)m.get("paramData"));
			/*String paramData=(String)m.get("paramData");
			StringBuffer paramGroup = new StringBuffer();
			List<Map> maps = JsonUtils.jsonToList(paramData, Map.class);
			for (int j = 0; j <maps.size() ; j++) {
				Map map1 = maps.get(j);
				paramGroup.append(map1.get("group")+" ");
			}
			re.setParamData(paramGroup.toString().trim());*/
			re.setCreated((Date)m.get("created"));
			re.setUpdated((Date)m.get("updated"));
			re.setItemCatId((long)m.get("itemCatId"));
			re.setItemCatName((String)m.get("itemCatName"));
			list.add(re);
		}
		System.out.println(JsonUtils.objectToJson(list));
		map.put("total",info.getTotal());
		map.put("rows",list);
		return map;
	}

	@Override
	public TaotaoResult deleteItemParams(List ids) {
		ItemParamExample itemParamExample = new ItemParamExample();
		ItemParamExample.Criteria criteria = itemParamExample.createCriteria();
		criteria.andIdIn(ids);
		itemParamMapper.deleteByExample(itemParamExample);
		return TaotaoResult.ok();
	}
}
