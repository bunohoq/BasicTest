package com.test.java.aop;

public interface Memo {

	//�޸� ����
	void memo_add(String memo);
	
	//�޸� �б�
	String memo_read(String seq) throws Exception;
	
	//�޸� ����
	boolean memo_edit(String seq, String memo);
	
	//�޸� ����
	boolean memo_del(String seq);
	
}
















