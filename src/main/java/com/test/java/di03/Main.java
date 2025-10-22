package com.test.java.di03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		
			������ ���� ���
			1. XML ���
			2. ������̼� ���
			3. �ڹ� ���
			
			
			Bean, ��
			- �ڹ� ��
			- EJB > ��ü�� ���̶�� ǥ��
			- ������ > ��ü�� ���̶�� ǥ��
			
			
			������ ���� > �����̳� ����
			1. ��ü ����(new Hong())
			2. ��ü ����
			3. ��ü �Ҹ�
			
			
			��ü ���� > ���������� ��Ź
			1. XML > bean ����(����)
			2. ������ �����̳� ����
			3. �� ����
				
		*/
		
		//���� ����
		Hong hong1 = new Hong();
		
		//�������� ���ؼ� ����
		
		//������ �����̳� == OO ���ؽ�Ʈ
		//ApplicationContext content = new ClassPathXmlApplicationContext("/src/main/java/com/test/java/di03/di03.xml");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/java/di03/di03.xml");
		
		//new Hong() ȣ��
		Hong hong2 = (Hong)context.getBean("hong");
		
		
		//��ü�� �����ϴ� ����� ���̰� ���� ��
		//��ü ��ü�� ���̰� ���� ����.
		hong1.work();
		hong2.work();
		
		//System.out.println(hong1.hashCode());
		//System.out.println(hong2.hashCode());
		
		
		Lee lee = (Lee)context.getBean("lee");
		
		lee.work();
		
		//System.out.println(lee.hashCode());
		
		
	}

}













