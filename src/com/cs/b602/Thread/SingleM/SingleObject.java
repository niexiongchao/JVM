package com.cs.b602.Thread.SingleM;

public class SingleObject {
	private static SingleObject singleObject =new SingleObject();
	private SingleObject(){

	}
	public static SingleObject getInstance(){
		return singleObject;
		
		
	}
	
}
