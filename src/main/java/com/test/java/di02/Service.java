package com.test.java.di02;

public class Service {
	
	private Employee employee;	
	
	public Service(Employee employee) {
		this.employee = employee;
	}
		
	public void doSomething() {
		
		System.out.println("�ڷ� ����");
				
		//hong.work();
		//lee.work();
		employee.work();
		
		System.out.println("�ڷ� ����");		
		
	}

}












