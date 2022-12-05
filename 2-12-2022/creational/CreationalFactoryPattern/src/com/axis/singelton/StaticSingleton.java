package com.axis.singelton;

public class StaticSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo sd=StaticDemo.getInstance();

	}

}
class StaticDemo{
	public static StaticDemo obj;
	private StaticDemo() {
			System.out.println("Static Singleton instantiated"); 
	}
	static {
		try {
			obj=new StaticDemo();
		}
		catch(Exception e) {
			throw new RuntimeException("Exception occred during creation of singleton instance");
		}
	}
	public static StaticDemo getInstance() {
		return obj;
	}
}