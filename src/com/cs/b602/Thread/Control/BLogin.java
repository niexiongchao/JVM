package com.cs.b602.Thread.Control;

public class BLogin extends Thread {
	
	@Override
	public void run(){
		LoginServlet.doPost("b", "bb");
		
		
	}
}
