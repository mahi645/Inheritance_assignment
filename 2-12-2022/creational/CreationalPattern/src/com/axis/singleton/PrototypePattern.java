package com.axis.singleton;

public class PrototypePattern implements Prototype{
	//all variables are private
	private int id;
	private String name;
	private int salary;
	public PrototypePattern() {
		System.out.println("prototype pattern constructor 1");
	}
	public PrototypePattern(int id,String name,int salary) {
		this();
		this.id=id;
		this.name=name;
		this.salary=salary;
		/*System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
		*/
	}
	public Prototype getClone() {
		return new PrototypePattern(id,name,salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PrototypePattern obj=new PrototypePattern();
		PrototypePattern ob2=new PrototypePattern(1,"uma",40000);
		ob2.getClone();
				

	}

}
interface Prototype{
	public Prototype getClone();
}

