package ex02;

import java.util.Arrays;

import org.springframework.context.support.GenericXmlApplicationContext;

import ex03.Customer;

public class MainClass {
	
	public static void main(String[] args) {
		
		// IOC컨테이너
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("application-context.xml");
		
		// 빈의 이름들 확인
		String[] arr = ctx.getBeanDefinitionNames();
		System.out.println(Arrays.toString(arr));
		
		// 빈을 꺼낼때는, 빈의 이름 or, 빈의 타입을 사용하는 reflect기법을 사용함
//		Hotel h = (Hotel)ctx.getBean("hotel");
		
		// 위랑 똑같은 건데, 이렇게 받아도 됨
//		Hotel h = ctx.getBean(Hotel.class); // 클래스 정보를 전달해서 사용하는 방법(reflect기법)
		Hotel h = ctx.getBean("hotel", Hotel.class); // 이렇게 해도 되는데, 바로위 방법 쓰자 그냥
		
		h.getChef().cooking();
		
		MemberDAO dao = ctx.getBean(MemberDAO.class);
		System.out.println(dao.getDataSource().getUrl());
		
		// IOC컨테이너 안에 Bean들은 자동으로 싱글톤 형식을 띄게 된다.
		// 만약, 다르게 생성하고 싶다면 scope="prototype" 라고 적으면 됨
		MemberDAO dao2 = ctx.getBean(MemberDAO.class);
		System.out.println(dao == dao2);
		
		Customer custo = ctx.getBean(Customer.class);
		System.out.println(custo.getList());
		System.out.println(custo.getMap());
		
		
		
		
	}

}
