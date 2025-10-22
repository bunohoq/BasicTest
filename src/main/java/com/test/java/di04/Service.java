package com.test.java.di04;

public class Service {
	
	private Employee employee;	
	
//	public Service(Employee employee) {
//		this.employee = employee;
//	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void doSomething() {
		
		System.out.println("자료 취합");
				
		employee.work();
		
		System.out.println("자료 전송");		
		
	}


}












