package com.cs.b602.Thread.RunableTest;

public class Produce_Shop {
	String lock;
	Produce_Shop(String lock){
		super();
		this.lock= lock;
		
	}
	
	public void getValue(){
		synchronized (lock) {
			try {
				if(ValueObject.value.equals("")){
					lock.wait();
				}
			
				System.out.println("getµÄÖµÎª"+ValueObject.value);
				ValueObject.value="";
				lock.notify();
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			
		}
		
	}
	
}
