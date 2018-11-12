package com.taotao.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController class
 *
 * @author wjh
 * @date 2018/11/8
 */
@Controller
public class PageController {
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	@RequestMapping("/rest/page/item-edit")
	public String itemEdit(){
		return "item-edit";
	}
}
