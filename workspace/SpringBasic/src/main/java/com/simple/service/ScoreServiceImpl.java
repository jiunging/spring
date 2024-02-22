package com.simple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.dao.ScoreDAO;

@Service("serviceScore") // 이름은 xxx, // service어노테이션은 컴포넌트 스캔에 읽혀서 자동빈생성
public class ScoreServiceImpl implements ScoreService{

	@Autowired
	private ScoreDAO scoreDAO;
	
	@Override 
	public void regist(ScoreVO vo) {
		scoreDAO.regist(vo);
		
		
		
	}
	
}
