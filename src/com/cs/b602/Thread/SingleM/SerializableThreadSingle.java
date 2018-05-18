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
	//�����л�ʱ�Զ����ã�����ָ���Ķ�����ѭ����ģʽ
	protected  Object readResolve() throws ObjectStreamException {
		System.out.println("����readResolve");
		return MyObjectHandler.myobject;
	}
	
}
