package com.cs.b602.Thread.SingleM;

import com.cs.b602.Thread.LanhanThread;

public class ThreadSingleRunTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ģʽ
		/*ThreadSingle threadSingle1 = new  ThreadSingle();
		ThreadSingle threadSingle2 = new  ThreadSingle();
		ThreadSingle threadSingle3 = new  ThreadSingle();
		
		threadSingle1.start();
		threadSingle2.start();
		threadSingle3.start();*/
		
		//����ģʽ
		LanhanThread thread1=new LanhanThread();
		LanhanThread thread2=new LanhanThread();
		LanhanThread thread3=new LanhanThread();
		LanhanThread thread4=new LanhanThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}

}
