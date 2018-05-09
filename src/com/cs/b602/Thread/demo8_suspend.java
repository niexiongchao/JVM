package com.cs.b602.Thread;

/*
 * 线程的暂停：suspend(),恢复resume(),容易造成资源的独占，其他线程无法同步访问
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
		Thread.sleep(1000);//休眠Main()线程
		//A段
		thread.suspend();//暂停thread线程
		System.out.println("A="+System.currentTimeMillis()+",i="+thread.getI());
		Thread.sleep(5000);//休眠Main()线程
		System.out.println("A="+System.currentTimeMillis()+",i="+thread.getI());
		
		//B段
		thread.resume();
		Thread.sleep(5000);
		//C段
		thread.suspend();
		System.out.println("B="+System.currentTimeMillis()+",i="+thread.getI());
		Thread.sleep(5000);
		System.out.println("B="+System.currentTimeMillis()+",i="+thread.getI());
		
	}
}
/*
 * //暂停后，与前一个i值相等，表明暂停成功
 * A=1525848365453,i=744117791,
A=1525848370456,i=744117791  
恢复以后，线程继续执行，i++，与前一个i值不等
B=1525848375461,i=4395802614 //再次暂停
B=1525848380471,i=4395802614//再次暂停
 */
