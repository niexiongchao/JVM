package com.cs.b602.Thread.Control;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread a= new ALogin();
		Thread b = new BLogin();
		a.start();
		b.start();
		/*
		 * ���̰߳�ȫ�����
		 username=a,password=bb
		 username=a,password=aa
		 
		 �̰߳�ȫ������
		 username=b,password=bb
		username=a,password=aa
		 */
	}

}
