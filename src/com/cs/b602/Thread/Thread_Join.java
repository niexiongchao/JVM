package com.cs.b602.Thread;

public class Thread_Join extends Thread {
	
	public  static  void main(String args[]) throws InterruptedException{
		Thread_Join mythread= new Thread_Join();
		mythread.start();
		mythread.join();
		System.out.print("我在后面执行！");
		
		
	}
	
	
	@Override
	public void run(){
		int secondValue =(int )(Math.random()*1000);
		System.out.print(secondValue);
		try {
			Thread.sleep(secondValue);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
