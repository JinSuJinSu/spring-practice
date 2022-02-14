package com.poscoict.container.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.poscoict.container.config.user.AppConfig01;
import com.poscoict.container.user.User;

public class AppConfigTest {
	
	public static void main(String[] args) {
<<<<<<< HEAD
//		testAppConfig01();
		testAppConfig02();
	}
	
	//java Config1
	//직접 자바 클래스(config class)를 전달
	// 설정 클래스에 @Configuration이 꼭 필요하다.
=======
		testAppConfig01();
		testAppConfig02();
	}
	
	// Java Config1
	// 직접 자바 클래스(config class)를 전달
>>>>>>> ce5c9b52ea917e91cd01233757a5aa283f53b841
	
	public static void testAppConfig01() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig01.class);
		
		User user = ac.getBean(User.class);
		System.out.println(user);
	}
	
<<<<<<< HEAD
	//java Config2
	//자바 설정클래스가 모여 있는 베이스 패키지
=======
	// Java Config2
	// 자바 설정클래스가 모여 있는 베이스 페키지를 전달
	// 설정 클래스에 @Configuration이 반드시 필요하다.
>>>>>>> ce5c9b52ea917e91cd01233757a5aa283f53b841
	
	public static void testAppConfig02() {
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.poscoict.container.config.user");
		
		User user = ac.getBean(User.class);
		System.out.println(user);
	}
	

}
