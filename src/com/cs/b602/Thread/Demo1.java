package com.cs.b602.Thread;
/*
 * 线程的随机调度
 */
public class Demo1 extends Thread {
	
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			
			int time = (int) (Math.random()*1000);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("run="+Thread.currentThread().getName());

		}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread demo1=new Demo1();
		demo1.setName("myTHread");
		demo1.start();
		try {
			
			for(int i=0;i<10;i++){
				int time= (int)(Math.random()*1000);
				Thread.sleep(time);
				System.out.println("main="+Thread.currentThread().getName());
				
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
