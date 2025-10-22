package com.test.java.di01;

public class Service {
	
	//1. DI ���� > ���� ��ü�� ���� ��� ������ �����Ѵ�.
	private Hong hong;
	private Lee lee;
	
	//2. DI ���� > ���� ��ü�� ���Թ޴´�. 
	//           > ���� ���� ������ �����Ѵ�.(������ or Setter)
	
	public Service(Hong hong) {
		this.hong = hong;
	}
	
	public Service(Lee lee) {
		this.lee = lee;
	}
	
//	public void setHong(Hong hong) {
//		this.hong = hong;
//	}
	
	public void doSomething() {
		
		//DI, Dependency Injection
		//- ����(��) ����
		//- ������ ����
		//- ��ü�� �ʿ��� �������� �ܺο��� ������ �ִ� ���� 
		
		
		// Service �ڽ��� ����
		System.out.println("�ڷ� ����");
		
		// �Ϻ� ���� > Hong ȣ��
		//Hong hong = new Hong();
		//hong.work();
		
		//Lee lee = new Lee();
		//lee.work();
		
		
		//���� ��ü�� ������ ����� ���
		//Hong hong = new Hong();
		//hong.work();
		
		
		//hong.work();
		lee.work();
		
		System.out.println("�ڷ� ����");		
		
	}

}












