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

		System.out.println(c==d);//true,-128=<n<=127ʱ��ʹ��Integer a=nʱ������л��棬�´�ֱ��ȡ����ַ����
		System.out.println(e==f);//false n>127ʱ�������new�������������󲻿������
		System.out.println(c==(a+b));//true,a+b=3,3�����ã���ַ��c���
		System.out.println(c.equals(a+b));//true,��ַ���
		System.out.println(g==(a+b));//true��g����Ϊlong,a+b����Ϊint,�Ƚ����Զ�����ת��Ϊlong,
		System.out.println(g.equals(a+b));//false,a+b�Ȳ�����ӣ���װ��ΪInteger,gΪLong,��װ�಻ͬ
		
		Integer h=new Integer(10);
		Integer i=new Integer(10);
		System.out.println("h==i��"+(h==i));//false��������ͬ
		
		Integer j=10;
		System.out.println("h==j��"+(h==j));//false,hΪָ��ѵĵ�ַ��jΪ�������еĵ�ַ�����߲�ͬ
		int k=10;
		System.out.println("h==k��"+(h==k));//true�����װ
		Integer l = 100;
		Integer m = 100;
		System.out.print(l == m); //true

		Integer n = 128;
		Integer p = 128;
		System.out.print(n == p); //false
	}

}
