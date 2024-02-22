package com.simple.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.MemberVO;

@Controller
@RequestMapping("/response")
public class ResponseController {
	
	@RequestMapping("/ex01")
	public String ex01(Model model) {
		
		// request.setAttribute(키, 값)
		model.addAttribute("name", "홍길동");
		model.addAttribute("list", Arrays.asList(1,2,3,4));
		model.addAttribute("age", 20);
		
		return "response/ex01";
	}
	
	@RequestMapping("/ex02")
	public ModelAndView ex02() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "이순신"); // 데이터 정보
		mv.addObject("age", 20); // 데이터 정보
		mv.setViewName("response/ex02"); // 뷰의 정보
		
		
		return mv;
	}
	
//	//ModelAttribute
//	@RequestMapping("/ex03")
//	public String ex03(@ModelAttribute("id") String id) {
//		
//		System.out.println("컨트롤러" + id);
//		return "response/ex03";
//	}
	
	//ModelAttribute
	@RequestMapping("/ex03") // vo로 값을 받아서 info이름으로 model을 넘긴다
	public String ex03(@ModelAttribute("info") MemberVO vo) {
		System.out.println(vo.toString());
		
		return "response/ex03";
	}
	
	// 화면처리
	@RequestMapping("/redirect_login")
	public String loginView() {
		
		System.out.println("요기 실행됨~!");
		return "response/redirect_login";
	}
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.POST)
	public String loginForm(@RequestParam("id") String id,
							@RequestParam("pw") String pw,
							RedirectAttributes ra) {
		
		if(id.equals(pw)) { // 로그인 성공
			return "response/redirect_ok";
		} else {
			// 이럼 forward 방식이 아니라, redirect방식으로 넘어감
			// model.addAttribute("msg", "아이디 비밀번호를 확인하세요");
			ra.addFlashAttribute("msg", "아이디 비밀번호를 확인하세요"); // 리다이렉트시에 1회성으로 데이터 사용이 가능함
			return "redirect:/response/redirect_login";
		}
		
	}

}
