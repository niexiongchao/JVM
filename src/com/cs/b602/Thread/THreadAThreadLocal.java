package com.cs.b602.Thread;

public class THreadAThreadLocal extends Thread{
	@Override
	public void run(){
		for (int i = 0; i < 100; i++) {
			ThreadLocalTool.t1.set("threadA"+(i+1));
			System.out.println("ThreadA get Value="+ThreadLocalTool.t1.get());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
	}
	

}
