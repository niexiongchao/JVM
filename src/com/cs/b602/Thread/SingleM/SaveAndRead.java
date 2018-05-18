package com.cs.b602.Thread.SingleM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveAndRead {
	public static void main(String[] args){
		try{
			//ʵ��������
			SerializableThreadSingle serThreadObject=SerializableThreadSingle.getInstance();
			//�����ļ�
			FileOutputStream fosRef =new FileOutputStream(new File("myobjectFile.txt"));
			//ʵ�����������
			ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
			//д�����
			oosRef.writeObject(serThreadObject);
			oosRef.close();
			fosRef.close();
			System.out.println(serThreadObject.hashCode());
		}catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try{
			FileInputStream fisRef =new FileInputStream(new File("myObjectFile.txt"));
			//ʵ�����������
			ObjectInputStream iosRef = new ObjectInputStream(fisRef);
			//��������
			SerializableThreadSingle serThreadObject=(SerializableThreadSingle)iosRef.readObject();
			
			iosRef.close();
			fisRef.close();
			System.out.println(serThreadObject.hashCode());
			
			
			
		}catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
