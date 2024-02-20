package quiz01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Computer {
	
	// 의존객체 자동주입으로, 의존성 주입으로 표현하고, main클래스에서는 컨테이너 생성해서 확인
	
	@Autowired
	private Mouse mouse;
	@Autowired
	private Keyboard kb;
	@Autowired
	private Monitor monitor;
	
	public void computerInfo() {
		System.out.println("***컴퓨터 정보***");
		mouse.info();
		kb.info();
		monitor.info();
	}
	
}
