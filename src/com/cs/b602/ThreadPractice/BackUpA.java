package com.cs.b602.ThreadPractice;

public class BackUpA extends Thread {
	private DbTools dbTools;
	
	public BackUpA(DbTools dbtools) {
		// TODO Auto-generated constructor stub
		super();
		this.dbTools=dbtools;
	}
	
	
	
	@Override
	public void run(){
		dbTools.backupA();
		
		
	}
}
