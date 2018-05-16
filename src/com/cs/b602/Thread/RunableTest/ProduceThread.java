package com.cs.b602.Thread.RunableTest;

public class ProduceThread extends Thread {
	private ProduceAndShop p;
	
	public ProduceThread(ProduceAndShop p){
		super();
		this.p=p;
	}
	
	@Override
	public void run(){
		while(true){
			p.setValue();
		}
		
		
	}
	
}
