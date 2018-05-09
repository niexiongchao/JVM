package com.cs.b602.Thread;

public class demo6_stop extends Thread {
	int i=0;
	
	@Override
	public void run(){
		while(true){
			i++;
			System.out.println("i="+(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new demo6_stop();
		thread.start();
		try {
			Thread.sleep(8000);//main()线程休眠8s,让出时间给thread线程，main线程为程序运行的第一个启动的线程
			thread.stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
