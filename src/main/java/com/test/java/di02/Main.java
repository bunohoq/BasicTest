package com.test.java.di02;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		
			��ü�� �����ϴ� ����
		
			���� ���
			- ��ü�� �ʿ��� �� ���� ���� ����ϴ� ���
			- Main ���� > Service ���� > Hong ����
			
			
			DI ���
			- Hong ���� > Service ���� > Main ����
			
			
			IoC, Inversion of Control, ������ ����
			- ��ü ���� ������ �Ųٷ� �ڹٲ� ��Ȳ > ���� ǥ��
			- ���α׷��� (��ü �����ϴ�)���� �帧�� �����ڰ� �ƴ� �����ӿ�ũ�� �����ϰ� �ϱ� ���ؼ� > ����!!
			
					
		*/
		
		Employee hong = new Hong();
		
		Service service = new Service(hong);
		service.doSomething();
		
		Employee lee = new Lee();
		
		Service service2 = new Service(lee);
		service2.doSomething();
		
	}

}













