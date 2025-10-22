package com.test.java.aop;

import java.util.Calendar;

import org.aspectj.lang.ProceedingJoinPoint;

//���� ���� > �α� ���
public class Logger {

	//���� ���� ����
	public void log() {
		
		Calendar now = Calendar.getInstance();
		System.out.printf("[%tF %tT] �α׸� ����մϴ�.\r\n", now, now);
		
	}
	
	public void around(ProceedingJoinPoint jp) {
		
		//Ư�� ������ ����Ǵ� �ҿ� �ð�
		//System.out.println("�� ���� ���� ��");
		long begin = System.nanoTime();

		//�� ���� ����
		// > ���Ͻ� ��ü(Proxy Object) > jp
		try {
			jp.proceed();
		} catch (Throwable e) {
			
		}
		
		//System.out.println("�� ���� ��ȿ ��");
		long end = System.nanoTime();
		System.out.println("�ҿ� �ð�:" + (end - begin) + "ns");
		
	}
	
}






























