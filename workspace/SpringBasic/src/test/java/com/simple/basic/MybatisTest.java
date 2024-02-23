package com.simple.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.command.ScoreVO;

// 이 클래스를 Junit4와 연결해서 스프링 클래스로 동작을 시키려면
@RunWith(SpringJUnit4ClassRunner.class)
// 이녀석을 테스트로 동작시킬거임(root-context.xml 파일)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") // 테스트할 스프링 bean 파일의 경로
public class MybatisTest {
	
	@Autowired
	private TestMapper testMapper;
	
	// 이거 실행은 ctrl + f11 아님
	// 우클릭 run as -> junit test 이걸로 실행함
//	@Test
//	public void helloworld() {
//		System.out.println("단위테스트: hello world");
//	}
//	
//	@Test
//	public void getTime() {
//		String time = testMapper.getTime();
//		System.out.println(time);
//	}
	
//	@Test
//	public void insertOne() {
//		int result = testMapper.insertOne("엄준식");
//		System.out.println("성공실패: " + result);
//	}
	
//	@Test
//	public void insertTwo() {
//		ScoreVO vo = new ScoreVO(0, "이순신", "100", "100", "100");
//		int result = testMapper.insertTwo(vo);
//		System.out.println("성공실패: " + result);
//	}
	
//	@Test
//	public void insertFour() {
//		Map<String, String> map = new HashMap<>();
//		map.put("name", "홍길자");
//		map.put("kor", "20");
//		map.put("eng", "20");
//		map.put("math", "20");
//		
//		int result = testMapper.insertFour(map);
//		System.out.println("성공실패: " + result);
//	}
	
//	 매개변수가 2개일 때는 이렇게 / 근데 왜 안 됨?
//	@Test
//	public void insertThree() {
//	    int result = testMapper.insertThree("엄준식", 300);
//	    System.out.println("성공실패: " + result);
//	}
	
//	@Test
//	public void selectOne() {
//		ScoreVO vo = testMapper.selectOne(21);
//		
//		System.out.println(vo.toString());
//		
//	}
	
//	@Test
//	public void selectTwo() {
//		Map<String, Object> map = testMapper.selectTwo(21);
//		System.out.println(map.toString());
//	}
	
//	@Test
//	public void selectThree() {
//		
//		ArrayList<ScoreVO> list = testMapper.selectThree();
//		System.out.println(list);
//		
//		ArrayList<Map<String, Object>> map = testMapper.selectFour();
//		System.out.println(map);
//		
//	}
	
	// update 실습 - vo를 이용해서 매개변수를 전달하고, vo에 해당하는 데이터를 업데이트
//	@Test
//	public void updateOne() {
//		ScoreVO vo = new ScoreVO(18, "엄준tt식", "12333", "456", "789");
//
//		int result = testMapper.updateOne(vo);
//		
//		System.out.println("업데이트 성공실패여부: " + result);
//	}
//	
	
	// delete 실습 - sno를 전달해서 해당 번호를 delete
	@Test
	public void deleteOne() {
		
		int result = testMapper.deleteOne(23);
		System.out.println("삭제 성공실패여부: " + result);
		
	}
	
	
	
	
	
	
	
	
	
	

}
