package com.simple.score.mapper;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

// 마이바티스 인터페이스
public interface ScoreMapper {
	public void regist(ScoreVO vo);
	public ArrayList<ScoreVO> getList();
	public void delete(int sno);
	

}
