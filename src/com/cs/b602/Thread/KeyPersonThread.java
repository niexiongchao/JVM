package com.cs.b602.Thread;

public class KeyPersonThread extends Thread {
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+"ս����ʼ��");
		for(int i=1;i<=10;++i)
		{
			System.out.println(Thread.currentThread().getName()+"����:"+i);
			
			
		}
		System.out.println(Thread.currentThread().getName()+"ս����");
		
		
	}
	
}
