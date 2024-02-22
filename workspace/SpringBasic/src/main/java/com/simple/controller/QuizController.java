package com.simple.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.MemberVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	@RequestMapping("/quiz01")
	public String quiz01() {
		System.out.println("quiz01로 들어옴");
		return "quiz/quiz01";
	}
	
	// 내가 한 거
//	@RequestMapping(value = "/sendBirth", method = RequestMethod.POST)
//	public String quiz01Ok(@ModelAttribute("year") String year,
//						 @ModelAttribute("month") String month,
//						 @ModelAttribute("day") String day) {
//		
//		return "quiz/quiz01_ok";
//	}
	
	// 쌤이 한 거
	@RequestMapping(value = "/sendBirth", method = RequestMethod.POST)
	public String quiz01Ok(@RequestParam("year") int year,
						   @RequestParam("month") int month,
						   @RequestParam("day") int day,
						   Model model) {
		
		String birth = year + "년" + month + "월" + day + "일";
		System.out.println(birth);
		
		model.addAttribute("birth", birth);
		
		return "quiz/quiz01_ok";
	}
	
	// 내가 한 거
//	@RequestMapping("/quiz02")
//	public String quiz02(@ModelAttribute("info") MemberVO vo1, 
//						 @ModelAttribute("info2") MemberVO vo2,
//						 @ModelAttribute("info3") MemberVO vo3) {
//		
//		List<MemberVO> list = new ArrayList<MemberVO>();
//		vo1.setId("aaa123");
//		vo1.setName("엄준식");
//		vo1.setAge(22);
//		vo1.setInter(null);
//		
//		vo2.setId("bbb123");
//		vo2.setName("험준식");
//		vo2.setAge(42);
//		vo2.setInter(null);
//		
//		vo3.setId("ccc1234");
//		vo3.setName("힝준식");
//		vo3.setAge(555);
//		vo3.setInter(null);
//
//
//		list.add(vo1);
//		list.add(vo2);
//		list.add(vo3);
//		
//		return "quiz/quiz02";
//	}
	
	// 선생님 버전
	@RequestMapping("/quiz02")
	public String quiz02(Model model) {
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		list.add(new MemberVO("aaa123", "홍길동", 20, null));
		list.add(new MemberVO("bbb123", "홍길자", 30, null));
		list.add(new MemberVO("ccc123", "이순신", 40, null));
		
		model.addAttribute("list", list);
		
		return "quiz/quiz02";
	}
	
	// a링크를 타고 넘어오는 요청(내꺼)
//	@RequestMapping("/quiz02_ok")
//	public String quiz02_ok(@ModelAttribute("id") String id, Model model) {
//		model.addAttribute("id", id);
//		return "quiz/quiz02_ok";
//	}
	
	// a링크를 타고 넘어오는 요청(쌤꺼)
	@RequestMapping("/quiz02_ok")
	public String quiz02_ok(@ModelAttribute("id") String id, Model model) {
		model.addAttribute("id", id);
		return "quiz/quiz02_ok";
	}
	
	
	

}
