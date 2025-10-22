package com.test.java.di02;

public class Service {
	
	private Employee employee;	
	
	public Service(Employee employee) {
		this.employee = employee;
	}
		
	public void doSomething() {
		
		System.out.println("자료 취합");
				
		//hong.work();
		//lee.work();
		employee.work();
		
		System.out.println("자료 전송");		
		
	}

}












