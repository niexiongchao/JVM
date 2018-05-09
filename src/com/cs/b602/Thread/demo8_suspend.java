package com.cs.b602.Thread;

/*
 * �̵߳���ͣ��suspend(),�ָ�resume(),���������Դ�Ķ�ռ�������߳��޷�ͬ������
demo8
 */
public class demo8_suspend extends Thread {
	private long i;
	public long getI() {
		return i;
	}

	public void setI(long i) {
		this.i = i;
	}

	@Override
	public void run(){
		while(true){
			i++;
		}
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		demo8_suspend thread =new demo8_suspend();
		thread.start();
		Thread.sleep(1000);//����Main()�߳�
		//A��
		thread.suspend();//��ͣthread�߳�
		System.out.println("A="+System.currentTimeMillis()+",i="+thread.getI());
		Thread.sleep(5000);//����Main()�߳�
		System.out.println("A="+System.currentTimeMillis()+",i="+thread.getI());
		
		//B��
		thread.resume();
		Thread.sleep(5000);
		//C��
		thread.suspend();
		System.out.println("B="+System.currentTimeMillis()+",i="+thread.getI());
		Thread.sleep(5000);
		System.out.println("B="+System.currentTimeMillis()+",i="+thread.getI());
		
	}
}
/*
 * //��ͣ����ǰһ��iֵ��ȣ�������ͣ�ɹ�
 * A=1525848365453,i=744117791,
A=1525848370456,i=744117791  
�ָ��Ժ��̼߳���ִ�У�i++����ǰһ��iֵ����
B=1525848375461,i=4395802614 //�ٴ���ͣ
B=1525848380471,i=4395802614//�ٴ���ͣ
 */
