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
		
		System.out.println("�ڷ� ����");
				
		employee.work();
		
		System.out.println("�ڷ� ����");		
		
	}


}












