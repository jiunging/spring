package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController {
	
	@RequestMapping("/aaa/bbb")
	public String ex01() {
		return "/request/ex01";  // return "화면의 경로";
//		return "https://www.naver.com";
	
	}

}
