package com.cs.b602.Thread.RunableTest;

public class DemoRunnable_1 implements Runnable {

	private boolean isContinuePrint =true;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		printStringMethod();
		
	}
	
	public void printStringMethod(){
		
		while(isContinuePrint==true)
		{
			System.out.print("run printStringMethod threadName="+Thread.currentThread().getName());
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
		DemoRunnable_1 demoRunnable_1 =new DemoRunnable_1();
		new Thread(demoRunnable_1).start();
		System.out.print("ÎÒÒªÍ£Ö¹Ëü£¡ stopThread="+Thread.currentThread().getName());
		demoRunnable_1.setContinuePrint(false);
	}

	public boolean isContinuePrint() {
		return isContinuePrint;
	}

	public void setContinuePrint(boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}

}
