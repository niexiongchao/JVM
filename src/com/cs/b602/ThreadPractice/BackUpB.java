package com.cs.b602.ThreadPractice;

public class BackUpB extends Thread {
	private DbTools dbTools;
	
	public BackUpB(DbTools dbtools) {
		// TODO Auto-generated constructor stub
		super();
		this.dbTools=dbtools;
	}

	@Override
	public void run(){
		dbTools.backupB();
		
		
	}
}
