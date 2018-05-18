package com.cs.b602.Thread;

public class LanhanThread extends Thread {
	@Override
	public void run(){
		/*try {
			//懒汉模式
			System.out.println(LanhanSingleObject.getInstance().hashCode());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*
		 * 静态内置类实现单例模式
		 * 
		 */
		System.out.println(HandObject.getInstance().hashCode());
		
	}
}
