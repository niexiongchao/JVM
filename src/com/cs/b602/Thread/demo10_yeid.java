package com.cs.b602.Thread;


/*
 * yeid����cpu����Դ���������߳�ʹ��
 * 
 */
public class demo10_yeid extends Thread {

	@Override
	public void run(){
			long beginTime = System.currentTimeMillis();
			int count=0;
			for(int i=0;i<500000;i++){
				Thread.yield();//����ִ��ʱ��
				count=count+(i+1);
			}
			long endTime =System.currentTimeMillis();
			System.out.println("��ʱ��"+(endTime-beginTime)+"���룡");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new demo10_yeid();
		thread.start();
	}
	

}
/*
������ʱ��
��ʱ��16���룡
����ʱ��
��ʱ��31���룡
*/

