package com.cs.b602.Thread;

/*
 * i--��System.out.println()�ķ��̰߳�ȫ
 * 
 */
public class demo3 extends Thread {

	private int i=5;
	@Override
	public void run(){
		//�̰߳�ȫ
		synchronized (this) {
			System.out.println("i="+(i--)+"threadName="+Thread.currentThread().getName());
		}
		
		//i--����ȫ��printΪ�̰߳�ȫ,������printִ��֮ǰ��i--��ִ��
		
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
 * �����
 * i=5threadName=myThread1
i=4threadName=myThread2
i=2threadName=myThread-5
i=3threadName=myThread3
i=5threadName=myThread-4
��һ�����ʷ������̰߳�ȫ

�����synchronize��validate�����
 */
		
	
	}
	
}
