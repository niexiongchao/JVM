package com.cs.b602.yufatang;

public class Zhuangxiang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a=1;
		Integer b=2;
		Integer c=3;
		Integer d=3;
		Integer e =321;
		Integer f= 321;
		
		Long g= 3L;

		System.out.println(c==d);//true,-128=<n<=127时，使用Integer a=n时，会进行缓存，下次直接取，地址不变
		System.out.println(e==f);//false n>127时，会进行new操作，两个对象不可能相等
		System.out.println(c==(a+b));//true,a+b=3,3被重用，地址与c相等
		System.out.println(c.equals(a+b));//true,地址相等
		System.out.println(g==(a+b));//true，g拆箱为long,a+b拆箱为int,比较则自动向上转型为long,
		System.out.println(g.equals(a+b));//false,a+b先拆箱相加，再装箱为Integer,g为Long,包装类不同
		
		Integer h=new Integer(10);
		Integer i=new Integer(10);
		System.out.println("h==i，"+(h==i));//false两个对象不同
		
		Integer j=10;
		System.out.println("h==j，"+(h==j));//false,h为指向堆的地址，j为常量池中的地址，两者不同
		int k=10;
		System.out.println("h==k，"+(h==k));//true，拆包装
		Integer l = 100;
		Integer m = 100;
		System.out.print(l == m); //true

		Integer n = 128;
		Integer p = 128;
		System.out.print(n == p); //false
	}

}
