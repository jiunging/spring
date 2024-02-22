package com.simple.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.MemberVO;

@Controller
@RequestMapping("/request") // 
public class RequestController {
	
	// 화면
//	@RequestMapping("/ex01")
//	public String ex01() {
//		return "request/ex01";  // return "";
//	}
	
	// 화면을 띄우는 요청
	@RequestMapping(value = "/ex01")
	public void ex01() {}

	// get방식만 허용함 get. RequestMethod.GET
	// post방식만 허용함 post RequestMethod.POST
	// 안 적으면 둘 다 허용됨
	@RequestMapping( value="/basic", method = RequestMethod.POST)
	public void basic() {
		System.out.println("잘 실행됨");
	}
	
	// ex02화면
	@RequestMapping("/ex02")
	public String ex02() {
		return "request/ex02";
	}
	
	// 폼의 요청
//	@RequestMapping(value="/param", method = RequestMethod.POST)
//	public String param(HttpServletRequest request) { // 데이터를 받을거야~
//		
//		System.out.println(request.getParameter("id"));
//		System.out.println(request.getParameter("name"));
//		System.out.println(request.getParameter("age"));
//		System.out.println(Arrays.toString( request.getParameterValues("inter")));
//		
//		return "request/ex02_result";
//	}
	
	// @RequestParam - 반드시 필수로 넘겨야하는 파라미터가 됨, 값을 안 보내면 에러뜸(예)
	// 근데 이걸 방지하려면 required = false를 사용하면 됨
//	@RequestMapping(value="/param", method = RequestMethod.POST)
//	public String param(@RequestParam("id") String id,
//						@RequestParam("name") String x,
//						@RequestParam("age") int y,
//						@RequestParam(value="inter",
//									  required = false,
//									  defaultValue = ""
//								) ArrayList<String> list) {
//		
//		System.out.println(id);
//		System.out.println(x);
//		System.out.println(y);
//		
//		System.out.println(list.toString());
//
//
//
//
//		return "request/ex02_result";
//	}
	
	// VO객체를 이용한 자동맵핑
	@RequestMapping("/param")
	public String param(MemberVO vo) {
		System.out.println(vo.toString());
		
		return "request/ex02_result";
	}
	
	
	
	
	
	
	
	
	
	
	

}
