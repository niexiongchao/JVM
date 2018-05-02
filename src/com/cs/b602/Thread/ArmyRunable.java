package com.cs.b602.Thread;

public class ArmyRunable implements Runnable {
//加锁,改变就写回
	volatile boolean keepRunning=true;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(keepRunning){
			for(int i=1;i<=5;i++){
				
				System.out.println(Thread.currentThread().getName()+"进攻"+i);
				Thread.yield();//让出处理器时间
			}
			
		}
		System.out.println(Thread.currentThread().getName()+"结束战斗");
		
	}

}
