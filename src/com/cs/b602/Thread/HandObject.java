package com.cs.b602.Thread;

public class HandObject {
	
	
	public static class ObjectHand{
		private static HandObject handObject=new HandObject();
	
	}
public static HandObject getInstance(){
	
	return ObjectHand.handObject;
	
}
	
	private HandObject() {
		// TODO Auto-generated constructor stub
	} 
}
