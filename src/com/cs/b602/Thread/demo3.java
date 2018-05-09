package com.cs.b602.Thread;

/*
 * i--与System.out.println()的非线程安全
 * 
 */
public class demo3 extends Thread {

	private int i=5;
	@Override
	public void run(){
		//线程安全
		synchronized (this) {
			System.out.println("i="+(i--)+"threadName="+Thread.currentThread().getName());
		}
		
		//i--不安全，print为线程安全,但是在print执行之前，i--先执行
		
	}
	
	public static void main(String args[]){
		Thread run = new demo3();
		Thread myThread1=new Thread(run);
		myThread1.setName("myThread1");
		Thread myThread2=new Thread(run);
		myThread2.setName("myThread2");
		Thread myThread3=new Thread(run);
		myThread3.setName("myThread3");
		Thread myThread4=new Thread(run);
		myThread4.setName("myThread-4");
		Thread myThread5=new Thread(run);
		myThread5.setName("myThread-5");
		
		Thread[] myThread = {myThread1,myThread2,myThread3,myThread4,myThread5};
		for (Thread thread : myThread) {
			thread.start();
		}
/*
 * 结果：
 * i=5threadName=myThread1
i=4threadName=myThread2
i=2threadName=myThread-5
i=3threadName=myThread3
i=5threadName=myThread-4
有一定概率发生非线程安全

解决：synchronize，validate代码块
 */
		
	
	}
	
}
