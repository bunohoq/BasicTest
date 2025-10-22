package com.test.java.di01;

public class Main {
	
	public static void main(String[] args) {
		
		// ����
		// Main(����) > Service(����) > Hong(����)
		
		// ��ü ���� ����
		// 1. Hong
		// 2. Service
		// 3. Main
		
		
		//Main > (����) > Service > (����) > Hong
		//Main > (����) > Service > (����) > Hong
		
		
		//Hong > ���
		//Lee > �Ի�
		//- Hong�� Lee�� ������μ��� �ٸ� ���
		//- Hong�� Lee�� �������μ��� ���� ������ �ϴ� ����
		
		//*** ���±����� ���
		//- �ʿ���ϴ� ���� ��ü�� ���� ���� + ����ϴ� ���
		
		//*** ������ ���
		//- ���� ��ü�� ������ ���� ����
		//- �ܺηκ��� ���� ��ü�� ���� + ����ϴ� ���
		
		
		//Service service = new Service();
		//service.doSomething();
		
		//Service�� ���� ��ü > Hong
		Hong hong = new Hong();
		
		//Service ���� + ���� ��ü ����
		//Service service = new Service(hong); //���� ����(DI) ��
		//service.doSomething();
		
		//Service service = new Service();
		//service.setHong(hong); //���� ����(DI) �߻�
		//service.doSomething();
		
		
		Lee lee = new Lee();
		
		Service service = new Service(lee);
		service.doSomething();
		
		
	}

}













