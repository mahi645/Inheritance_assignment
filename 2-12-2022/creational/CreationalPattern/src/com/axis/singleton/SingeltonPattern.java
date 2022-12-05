package com.axis.singleton;

public class SingeltonPattern {
	public static void main(String args[]) {
		Singleton obj=Singleton.getPattern();
		System.out.println(obj.hashCode());
		Singleton ob2=Singleton.getPattern();
		System.out.println(ob2.hashCode());
		
		
		Employee emp1=new Employee();
		System.out.println(emp1.hashCode());
		Employee emp2=new Employee();
		System.out.println(emp2.hashCode());
		
	}
	
}
class Singleton {
	private static final Singleton pattern=new Singleton();
	
	private Singleton() {
		System.out.println("Constructor will invoke for only one obj");
	}
	
	public static Singleton getPattern() {
		return pattern;
	}
}
class Employee{

}

