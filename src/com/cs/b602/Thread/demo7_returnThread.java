package com.cs.b602.Thread;

public class demo7_returnThread extends Thread {
	int i=0;
	@Override
	public void run(){
		while(true){
			i++;
			if(this.interrupted()){
				System.out.println("ÍË³öÁË");
				return;
				
			}
			System.out.println("i="+i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread thread = new demo7_returnThread();
			thread.start();
			try {
				Thread.sleep(3000);
				thread.interrupt();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
