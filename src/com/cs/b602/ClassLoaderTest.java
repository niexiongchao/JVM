package com.cs.b602;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassLoader myLoader =new ClassLoader() {
			
			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException{
				
				try {
					String fileName =name.substring(name.lastIndexOf(".")+1)+".class";
					InputStream is = getClass().getResourceAsStream(fileName);
					if(is==null){
						
						return super.loadClass(name);
						
					}
					byte[] b =new byte[is.available()];
					is.read(b);
					return defineClass(name, b,0, b.length);
				} catch (IOException e) {
					// TODO: handle exception
					throw new ClassNotFoundException();
					
				}
				
			}
			
		};
		Object obj =null;
		try {
			 obj = myLoader.loadClass("com.cs.b602.ClassLoaderTest").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(obj.getClass());
		System.out.println(obj instanceof com.cs.b602.ClassLoaderTest );
		
	}

}
