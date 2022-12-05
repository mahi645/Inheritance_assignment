package com.axis.behavioural.observer;


class StudentData {
	int marks;
	int noOfsub;
	CurrentMarks currentMarks;
	AverageMarks averageMarks;
	public StudentData(CurrentMarks currentMarks,
	AverageMarks averageMarks) {
		this.averageMarks=averageMarks;
		this.currentMarks=currentMarks;
	}
	private int getMarks() {
		return 190;
	}
	private int getSub() {
		return 5;
	}
	public void dataChanged() {
		marks=getMarks();
		noOfsub=getSub();
		averageMarks.update(marks, noOfsub);
		currentMarks.update(marks, noOfsub);
	}
	

}
