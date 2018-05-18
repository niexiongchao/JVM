package com.cs.b602.Thread;

public class LanhanSingleObject {

	private static LanhanSingleObject object;
	
	public static LanhanSingleObject getInstance() throws InterruptedException{
		if(object==null){
			Thread.sleep(1000);
			object=new LanhanSingleObject();
		}
		return object;
		
	}
}
