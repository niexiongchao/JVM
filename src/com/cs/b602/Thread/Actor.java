package com.cs.b602.Thread;

public class Actor extends Thread {
	public void run(){
		System.out.println(Thread.currentThread().getName()+"是一个演员");
		int count= 0;
		while(count<100){
			
			System.out.println(Thread.currentThread().getName()+"登台演出："+(++count));
			if(count%10==0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}

		System.out.println(Thread.currentThread().getName()+"登台演出结束");	
		
	}
	
	public static void main(String arg[]) {
		Actor jack = new Actor();
		jack.setName("Mr.Thread");
		jack.start();
		Thread  actRunable=new Thread(new Actress(), "MrsRunable");
		actRunable.start();
		
		
	}
}



class Actress implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count =0;
		while (count<100) {
			System.out.println(Thread.currentThread().getName()+"登台演出："+(++count));
			if(count%10==0){
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		System.out.println(Thread.currentThread().getName()+"登台演出结束");
		
	}
	
	
	
}
