package com.cs.b602.Thread.SingleM;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableThreadSingle implements Serializable{
	private static final long serialVersionUID=888l;
	
	private static class MyObjectHandler{
		
		private static final SerializableThreadSingle myobject= new SerializableThreadSingle();
		
		
	}
	private SerializableThreadSingle(){
		
	}
	
	public static SerializableThreadSingle getInstance(){
		
		return MyObjectHandler.myobject;
		
	}
	//反序列化时自动调用，返回指定的对象，遵循单例模式
	protected  Object readResolve() throws ObjectStreamException {
		System.out.println("调用readResolve");
		return MyObjectHandler.myobject;
	}
	
}
