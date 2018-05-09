package com.cs.b602.Thread;

public class Demo5_Sleep_stopThread extends Thread {

	@Override
	public void run(){
		
		super.run();
		try {
			System.out.println("run begin");
			Thread.sleep(2000000);
			System.out.print("run end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Ë¯ÃßÖÐ±»Í£Ö¹"+this.interrupted());
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Demo5_Sleep_stopThread();
		try {
				thread.start();
			Thread.sleep(200);
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
/*
run begin
Ë¯ÃßÖÐ±»Í£Ö¹false  
java.lang.InterruptedException: sleep interrupted
	at java.lang.Thread.sleep(Native Method)
	at com.cs.b602.Thread.Demo5_Sleep_stopThread.run(Demo5_Sleep_stopThread.java:11)
*/
