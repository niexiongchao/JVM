package com.cs.b602.Thread;

public class ThreadLocalDemo {

	public static ThreadLocal t1= new ThreadLocal();
	
	public static void main(String args[]){
		if(t1.get()==null){
			
			System.out.print("我的值为空");
			t1.set("设置我的值");
			
		}
		
		System.out.println(t1.get());
		System.out.println(t1.get());
		
		
	}
}
