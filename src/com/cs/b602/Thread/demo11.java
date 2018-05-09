package com.cs.b602.Thread;

/*
 * 守护线程
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
		myThread.setDaemon(true);//设置守护线程
		myThread.start();
		try {
			Thread.sleep(5000);
			System.out.println("退出,"+myThread.isAlive());
			Thread.sleep(5000);
			System.out.println(i);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
