package com.cs.b602.Thread;

public class demo6_stop extends Thread {
	int i=0;
	
	@Override
	public void run(){
		while(true){
			i++;
			System.out.println("i="+(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new demo6_stop();
		thread.start();
		try {
			Thread.sleep(8000);//main()�߳�����8s,�ó�ʱ���thread�̣߳�main�߳�Ϊ�������еĵ�һ���������߳�
			thread.stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
