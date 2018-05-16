package com.cs.b602.Thread.RunableTest;

public class Runnabel_Demo2 extends Thread {
	volatile public static int count;
	synchronized private static void addcount(){
		for(int i=0;i<100;i++){
			
			count++;
		}
		System.out.println("count="+count);
		
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		addcount();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnabel_Demo2[] demo2 =new Runnabel_Demo2[100];
		for (int i = 0; i < 100; i++) {
			demo2[i]=new Runnabel_Demo2();
			
		}
		for (int i = 0; i < 100; i++) {
			demo2[i].start();
		}
	}

}
