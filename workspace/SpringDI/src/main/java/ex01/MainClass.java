package ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
//		Person p = new Person();
//		System.out.println(p.getName());
		
//		스프링의 방식으로 Person객체를 사용해볼 예정
//		new 키워드 쓰지 않을거임
		
//		줄만 바꾼거임 이거, 제네릭~~ ctx = new ~이거임
		GenericXmlApplicationContext
		ctx = new GenericXmlApplicationContext("application-context.xml");
		
//		getBean이 object 타입이라서 (Person으로 타입캐스팅을 해야함
		Person p = (Person)ctx.getBean("p");
		System.out.println(p.getName());
		
		
		
		
		

	}

}
