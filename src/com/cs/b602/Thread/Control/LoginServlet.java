package com.cs.b602.Thread.Control;
/*
 * ����ģ��һ��Servlet���
 */
public class LoginServlet {
	private static String usernameRef;
	private static String passwordRef;
	
	synchronized public static void doPost(String username,String password){
		try {
			usernameRef = username;
		
			if(usernameRef.equals("a")){
				Thread.sleep(5000);
			}
			passwordRef = password;
			System.out.println("username="+usernameRef+",password="+password);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	

}
