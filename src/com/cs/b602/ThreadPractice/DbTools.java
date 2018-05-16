package com.cs.b602.ThreadPractice;

public class DbTools {
	volatile private boolean prevIsA=false;
	synchronized public void backupA(){
		try{
			while(prevIsA == true){
				wait();
				
				
			}
			for (int i = 0;i<5; i++) {
				System.out.println("A A A A A");
				
			}
			prevIsA =true;
			notifyAll();
			
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	synchronized public void backupB(){
		try{
			while(prevIsA == false)
				wait();
			
			for (int i = 0; i < 5; i++) {
				System.out.println("B B B B B");
			}
			prevIsA=false;
			notifyAll();
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}
	

}
