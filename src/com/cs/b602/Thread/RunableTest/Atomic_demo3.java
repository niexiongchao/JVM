package com.cs.b602.Thread.RunableTest;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic_demo3 extends Thread {
	private AtomicInteger  count =new AtomicInteger(0);
	
	@Override
	public void run(){
		
		
			for(int i=0;i<10000;i++)
			{
				System.out.println(count.incrementAndGet());
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atomic_demo3 atomic_demo3 =new Atomic_demo3();
		
			
			Thread thread1= new Thread(atomic_demo3);
			thread1.start();
			
			Thread thread4= new Thread(atomic_demo3);
			thread4.start();
			Thread thread2= new Thread(atomic_demo3);
			thread2.start();
			Thread thread3= new Thread(atomic_demo3);
			thread3.start();
	
		
	}

}
