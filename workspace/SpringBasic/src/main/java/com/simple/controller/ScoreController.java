package com.simple.controller;

import java.io.Console;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;
import com.simple.service.ScoreServiceImpl;

@Controller
@RequestMapping("/score")
public class ScoreController {
	
	// 1st
//	private ScoreService service = new ScoreServiceImpl();
	
	// 2nd
	@Autowired
	@Qualifier("serviceScore")
	private ScoreService service;
	
	// 화면
	@RequestMapping("/scoreRegist")
	public String scoreRegist() {
		System.out.println("controller 이슈");
		return "score/scoreRegist";
		}
	
	// 화면
	@RequestMapping("/scoreList")
	public String scoreList(Model model) {
		
		// select해서 모델에 담아서 화면에 가지고 나감
		ArrayList<ScoreVO> list = service.getList();
		model.addAttribute("list", list); // 이걸 하면 list라는 이름으로 화면에서 쓸 수 있음
		
		return "score/scoreList";
	}
	
	// 화면
	@RequestMapping("/scoreResult")
	public String scoreResultt() {
		return "score/scoreResult";
	}
	
	// 등록요청
	@RequestMapping(value = "/scoreForm", method = RequestMethod.POST)
	public String scoreForm(ScoreVO vo) {
		
		// 점수등록작업~~
		service.regist(vo);
		
		return "redirect:/score/scoreResult";
	}
	
	@RequestMapping("/deleteForm")
	public String deleteForm(@RequestParam("sno") int sno) {
		
		// 삭제하기
		service.delete(sno);
		
		return "redirect:/score/scoreList";
	}

}
