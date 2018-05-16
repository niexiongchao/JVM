package com.cs.b602.Thread.RunableTest;

/*
 * 生产者/消费者模式
 */

//生产者
public class ProduceAndShop {
	private String lock;
	public ProduceAndShop(String lock){
		
		super();
		this.lock=lock;
	}

	public void setValue(){
		try {
			synchronized (lock) {
				if(!ValueObject.value.equals("")){
					lock.wait();
				}
			
				
				String value=System.currentTimeMillis()+"_"+System.nanoTime();
				
				System.out.println("set的值为"+value);
				ValueObject.value=value;
				
				lock.notify();
			
			}
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		
	}
	
}
