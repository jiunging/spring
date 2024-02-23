package com.simple.basic;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.simple.command.ScoreVO;

// 마이바티스의 xml이랑 연결되는 인터페이스
// 동일한 이름으로 TestMapper.xml
public interface TestMapper {
	public String getTime();
	public int insertOne(String name); // insert`
	public int insertTwo(ScoreVO vo);
	public int insertFour(Map<String, String> map);
	public int insertThree(@Param("이름") String name, @Param("리름") int kor); // 매개변수가 2개

	
	public ScoreVO selectOne(int sno); // 단일행 조회하는 select
	public Map<String, Object> selectTwo(int sno); // 단일행 조회하는 select
	public ArrayList<ScoreVO> selectThree(); // 다중행 조회하는 select
	public ArrayList<Map<String, Object> > selectFour(); // 다중행 조회하는 select
	
	// update
	public int updateOne(ScoreVO vo);
	
	// delete
	public int deleteOne(int sno);
	
	
	
}









