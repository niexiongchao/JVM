package com.cs.b602.Thread;
/*
 * ���ݹ���
 * 
 */
public class Demo2 extends Thread {
	private  int count=6;
	
	@Override

	 synchronized public void run(){
		//super.run();
		count--;
		System.out.println(Thread.currentThread().getName()+"���㣺"+count);

	}

}
