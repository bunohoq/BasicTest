package com.test.java.di02;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		
			객체를 생성하는 순서
		
			이전 방식
			- 객체가 필요한 그 순간 만들어서 사용하는 방식
			- Main 생성 > Service 생성 > Hong 생성
			
			
			DI 방식
			- Hong 생성 > Service 생성 > Main 생성
			
			
			IoC, Inversion of Control, 제어의 역전
			- 객체 생성 순서가 거꾸로 뒤바뀐 상황 > 현상 표현
			- 프로그램의 (객체 생성하는)제어 흐름을 개발자가 아닌 프레임워크가 관리하게 하기 위해서 > 목적!!
			
					
		*/
		
		Employee hong = new Hong();
		
		Service service = new Service(hong);
		service.doSomething();
		
		Employee lee = new Lee();
		
		Service service2 = new Service(lee);
		service2.doSomething();
		
	}

}













