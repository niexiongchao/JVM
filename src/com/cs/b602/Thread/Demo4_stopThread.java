package com.cs.b602.Thread;

public class Demo4_stopThread extends Thread {

	@Override
	public void run(){
		super.run();
		try {
			for(int i=0;i<500000;i++){	
				if(this.interrupted())
				throw new InterruptedException();
				System.out.println("i="+(i+1));
				
			}

			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("ÍË³ö");
		
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread myThread=new Demo4_stopThread();
		
		myThread.start();
		try {
			myThread.sleep(2000);
			myThread.interrupt();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
	
		
		
	}

}
