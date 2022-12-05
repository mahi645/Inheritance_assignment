package com.axis.behavioural.observer;

public class CurrentMarks {
	private int marks;
	private int noOfsub;
	public void update(int marks,int noOfsub) {
		this.marks=marks;
		this.noOfsub=noOfsub;
		display();
	}
	public void display() {
		System.out.println("Current Marks Display\n "+"marks:"+marks+"\tNo.of sub:"+noOfsub);
	}

}
