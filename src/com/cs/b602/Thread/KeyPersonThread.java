package com.cs.b602.Thread;

public class KeyPersonThread extends Thread {
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+"战斗开始！");
		for(int i=1;i<=10;++i)
		{
			System.out.println(Thread.currentThread().getName()+"攻击:"+i);
			
			
		}
		System.out.println(Thread.currentThread().getName()+"战斗！");
		
		
	}
	
}
