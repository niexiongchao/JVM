package com.cs.b602.ThreadPractice;


//使用wait/notify,模拟交叉备份，关键设置prevIsA
public class WaitNotifyInsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbTools dbTools = new DbTools();
		for (int i = 0; i < 20; i++) {
			BackUpB output=new BackUpB(dbTools);
			output.start();
			BackUpA inputA = new BackUpA(dbTools);
			inputA.start();
			
		}
		
		
	}

}
