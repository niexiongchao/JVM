package com.cs.b602.Thread;

public class ArmyRunable implements Runnable {
//����,�ı��д��
	volatile boolean keepRunning=true;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(keepRunning){
			for(int i=1;i<=5;i++){
				
				System.out.println(Thread.currentThread().getName()+"����"+i);
				Thread.yield();//�ó�������ʱ��
			}
			
		}
		System.out.println(Thread.currentThread().getName()+"����ս��");
		
	}

}
