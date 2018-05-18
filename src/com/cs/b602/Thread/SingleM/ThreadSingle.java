package com.cs.b602.Thread.SingleM;

public class ThreadSingle  extends Thread{
	@Override
	public void run(){
		
		System.out.println(SingleObject.getInstance().hashCode());
		
	}

}
