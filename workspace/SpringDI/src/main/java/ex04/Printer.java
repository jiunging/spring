package ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	
	/*
	 * @Autowired
	 * 의존객체자동주입 - 타입으로 찾고, 이름으로 찾아서 자동 주입
	 * 
	 * @Resource - 이건 여기서 안 됨
	 * 
	 * @Qualifier
	 * 동일한 타입의 빈이 여러개 있으면, 자동주입에서 에러를 발생
	 * 특정 빈과 강제로 연결하는 어노테이션
	 * 
	 * 
	 */
	@Autowired
	@Qualifier("doc")// doc이름의 빈을 강제로 연결
	private Document document;
	
	// 주입 => 생성자, 세터
	public Printer() {
		
	}
	
	public Printer(Document document) {
		this.document = document;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	
	
	
	
	
	
	
	
	
	

}
