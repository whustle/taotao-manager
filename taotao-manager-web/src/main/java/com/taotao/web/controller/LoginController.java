package com.taotao.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * LoginController class
 *
 * @author wjh
 * @date 2018/11/8
 */

@Controller
@RequestMapping("/manager")
public class LoginController {
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}
