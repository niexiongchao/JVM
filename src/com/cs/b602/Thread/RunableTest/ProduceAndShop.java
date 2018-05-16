package com.cs.b602.Thread.RunableTest;

/*
 * ������/������ģʽ
 */

//������
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
				
				System.out.println("set��ֵΪ"+value);
				ValueObject.value=value;
				
				lock.notify();
			
			}
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		
	}
	
}
