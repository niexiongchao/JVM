package com.cs.b602.Thread;

public class LanhanThread extends Thread {
	@Override
	public void run(){
		/*try {
			//����ģʽ
			System.out.println(LanhanSingleObject.getInstance().hashCode());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*
		 * ��̬������ʵ�ֵ���ģʽ
		 * 
		 */
		System.out.println(HandObject.getInstance().hashCode());
		
	}
}
