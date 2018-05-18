package com.cs.b602.Thread;

public class ThreadLocalRunTest {
	public static void main(String args[]){
		Thread threadA=new THreadAThreadLocal();
		Thread threadB =new THreadBThreadLocal();
		
		
		threadA.start();
		threadB.start();
	}
}
