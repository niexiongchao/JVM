package com.cs.b602.Thread;

/*
 * �ػ��߳�
 */

public class demo11 extends Thread {
	private static int i=0;
	@Override
	public void run(){

			try {
				while(true){
					i++;
					System.out.println("i="+i);
					Thread.sleep(1000);}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread myThread = new demo11();
		myThread.setDaemon(true);//�����ػ��߳�
		myThread.start();
		try {
			Thread.sleep(5000);
			System.out.println("�˳�,"+myThread.isAlive());
			Thread.sleep(5000);
			System.out.println(i);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
