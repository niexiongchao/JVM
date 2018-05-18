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
			//实例化对象
			SerializableThreadSingle serThreadObject=SerializableThreadSingle.getInstance();
			//创建文件
			FileOutputStream fosRef =new FileOutputStream(new File("myobjectFile.txt"));
			//实例化输出对象
			ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
			//写入对象
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
			//实例化输出对象
			ObjectInputStream iosRef = new ObjectInputStream(fisRef);
			//读出对象
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
