package com.axis.behavioural.observer;

public class Observer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageMarks averageMarks=new AverageMarks();
		CurrentMarks currentMarks=new CurrentMarks();
		StudentData studentData=new StudentData(currentMarks,averageMarks);
		studentData.dataChanged();
	}

}
