package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		return "score/scoreRegist";
	}
	
	// 화면
	@RequestMapping("/scoreList")
	public String scoreList() {
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

}
