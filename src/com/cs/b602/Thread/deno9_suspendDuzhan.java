package com.cs.b602.Thread;

public class deno9_suspendDuzhan{
	
	synchronized public void printString(){
		System.out.println("begin");
		while(Thread.currentThread().getName().equals("a")){
			Thread.currentThread().suspend();

		}
		System.out.print("end");
		
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final deno9_suspendDuzhan demo9 = new deno9_suspendDuzhan();
		Thread myThread1 =new Thread(){
			@Override
			public void run(){	
				demo9.printString();
			}
		};
		myThread1.setName("a");
		myThread1.start();
		Thread.sleep(2000);
		
		
		
		Thread myThread2 =new Thread(){
			@Override
			public void run(){	
				System.out.println("thread2启动，但是无法调用printString(),因为printString一直被thread1暂停，独占");
				demo9.printString();
			}
		};
		myThread2.setName("B");
		myThread2.start();
	}

}
