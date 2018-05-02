package com.cs.b602.Thread;

public class stage extends Thread {

	public void run(){

		System.out.println("演出开始！");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ArmyRunable armyOfSuiRunable = new ArmyRunable();
		ArmyRunable arymOfRevolt = new ArmyRunable();
		
		Thread armyOfSui = new Thread(armyOfSuiRunable,"隋军");
		Thread armyOfRev = new Thread(arymOfRevolt,"起义军");		
		
		armyOfRev.start();
		armyOfSui.start();
		
		try {
			Thread.sleep(50);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		arymOfRevolt.keepRunning=false;
		armyOfSuiRunable.keepRunning=false;
		

		System.out.println("半路杀出程咬金");
		Thread mrCheng= new KeyPersonThread();
		mrCheng.setName("程咬金");
		//停止线程
		arymOfRevolt.keepRunning=false;
		armyOfSuiRunable.keepRunning=false;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		mrCheng.start();
		
		try {
			mrCheng.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("战斗结束！");
	}
	
	
	public static void main(String arg[]){
		Thread thread = new stage();
		thread.start();
		
		
	}
	
	
}
