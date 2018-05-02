package com.cs.b602.Thread.Control;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread a= new ALogin();
		Thread b = new BLogin();
		a.start();
		b.start();
		/*
		 * 非线程安全，结果
		 username=a,password=bb
		 username=a,password=aa
		 
		 线程安全：加锁
		 username=b,password=bb
		username=a,password=aa
		 */
	}

}
