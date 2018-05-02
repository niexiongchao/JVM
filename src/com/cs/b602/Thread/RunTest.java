package com.cs.b602.Thread;

public class RunTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数据共享，即使用同一个线程实例对象生成线程实例
		
		Demo2 demo = new Demo2();
		Thread thread1=new Thread(demo,"A");
		Thread thread2=new Thread(demo,"B");
		Thread thread3=new Thread(demo,"C");
		Thread thread4=new Thread(demo,"D");
		Thread thread5=new Thread(demo,"E");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		//数据不共享
		Thread thread9=new Thread(new Demo2(),"F");
		Thread thread6=new Thread(new Demo2(),"G");
		Thread thread7=new Thread(new Demo2(),"H");
		Thread thread8=new Thread(new Demo2(),"I");
		thread9.start();
		thread8.start();
		thread7.start();
		thread6.start();
	}

}


/*
 *运行结果
 *A计算：5
F计算：5
H计算：5
G计算：5
E计算：4
I计算：5
D计算：3
C计算：2
B计算：1
 
 * 
*/