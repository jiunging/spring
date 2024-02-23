package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.dao.ScoreDAO;
import com.simple.score.mapper.ScoreMapper;

@Service("serviceScore") // 이름은 xxx, // service어노테이션은 컴포넌트 스캔에 읽혀서 자동빈생성
public class ScoreServiceImpl implements ScoreService{

//	@Autowired
//	private ScoreDAO scoreDAO;
	
	// 마이바티스 인터페이스
	@Autowired
	private ScoreMapper scoreMapper;
	
	@Override 
	public void regist(ScoreVO vo) {
		scoreMapper.regist(vo);
	}

	@Override
	public ArrayList<ScoreVO> getList() {
		// ArrayList<ScoreVO> list = scoreDAO.getList();
		// 여기서 별다른 작업이 없으면 그냥 바로 리턴을 때려박아도 됨
		return scoreMapper.getList();
	}

	@Override
	public void delete(int sno) {
		scoreMapper.delete(sno);
	}
	
}
