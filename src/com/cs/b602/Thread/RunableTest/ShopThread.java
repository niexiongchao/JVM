package com.cs.b602.Thread.RunableTest;

public class ShopThread extends Thread {
	private Produce_Shop s;
	public  ShopThread(Produce_Shop s){
		super();
		this.s=s;
		
	}
	
	@Override
	public void run(){
		while(true){
			s.getValue();
		}
		
	}
}
