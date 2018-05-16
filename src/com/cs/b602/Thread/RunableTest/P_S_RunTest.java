/**
 * 
 */
package com.cs.b602.Thread.RunableTest;

/**
 * @author Niexiongchao
 *
 */
public class P_S_RunTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lock =new String("");
		ProduceAndShop p = new ProduceAndShop(lock);
		Produce_Shop s= new Produce_Shop(lock);
		Thread produce =new ProduceThread(p);
		Thread shop = new ShopThread(s);
		produce.start();
		shop.start();
	}

}
