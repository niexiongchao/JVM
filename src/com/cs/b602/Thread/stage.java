package com.cs.b602.Thread;

public class stage extends Thread {

	public void run(){

		System.out.println("�ݳ���ʼ��");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ArmyRunable armyOfSuiRunable = new ArmyRunable();
		ArmyRunable arymOfRevolt = new ArmyRunable();
		
		Thread armyOfSui = new Thread(armyOfSuiRunable,"���");
		Thread armyOfRev = new Thread(arymOfRevolt,"�����");		
		
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
		

		System.out.println("��·ɱ����ҧ��");
		Thread mrCheng= new KeyPersonThread();
		mrCheng.setName("��ҧ��");
		//ֹͣ�߳�
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
		
		System.out.println("ս��������");
	}
	
	
	public static void main(String arg[]){
		Thread thread = new stage();
		thread.start();
		
		
	}
	
	
}
