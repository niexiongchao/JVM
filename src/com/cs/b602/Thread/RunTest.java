package com.cs.b602.Thread;

public class RunTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ݹ�����ʹ��ͬһ���߳�ʵ�����������߳�ʵ��
		
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
		//���ݲ�����
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
 *���н��
 *A���㣺5
F���㣺5
H���㣺5
G���㣺5
E���㣺4
I���㣺5
D���㣺3
C���㣺2
B���㣺1
 
 * 
*/