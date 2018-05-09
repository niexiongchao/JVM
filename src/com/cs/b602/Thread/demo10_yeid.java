package com.cs.b602.Thread;


/*
 * yeid放弃cpu的资源，让其他线程使用
 * 
 */
public class demo10_yeid extends Thread {

	@Override
	public void run(){
			long beginTime = System.currentTimeMillis();
			int count=0;
			for(int i=0;i<500000;i++){
				Thread.yield();//放弃执行时间
				count=count+(i+1);
			}
			long endTime =System.currentTimeMillis();
			System.out.println("用时："+(endTime-beginTime)+"毫秒！");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new demo10_yeid();
		thread.start();
	}
	

}
/*
不放弃时间
用时：16毫秒！
放弃时间
用时：31毫秒！
*/

