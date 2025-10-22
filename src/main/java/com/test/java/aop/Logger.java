package com.test.java.aop;

import java.util.Calendar;

import org.aspectj.lang.ProceedingJoinPoint;

//보조 업무 > 로그 기록
public class Logger {

	//보조 업무 구현
	public void log() {
		
		Calendar now = Calendar.getInstance();
		System.out.printf("[%tF %tT] 로그를 기록합니다.\r\n", now, now);
		
	}
	
	public void around(ProceedingJoinPoint jp) {
		
		//특정 업무가 실행되는 소요 시간
		//System.out.println("주 업무 시작 전");
		long begin = System.nanoTime();

		//주 업무 진행
		// > 프록시 객체(Proxy Object) > jp
		try {
			jp.proceed();
		} catch (Throwable e) {
			
		}
		
		//System.out.println("주 업무 종효 후");
		long end = System.nanoTime();
		System.out.println("소요 시간:" + (end - begin) + "ns");
		
	}
	
}






























