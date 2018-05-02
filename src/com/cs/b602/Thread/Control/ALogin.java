package com.cs.b602.Thread.Control;

public class ALogin extends Thread {

	@Override
	public void run(){
		LoginServlet.doPost("a", "aa");
	}
	
}
