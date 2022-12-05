package com.axis.behavioural.observer;
class AverageMarks {
	private int marksRate;
	private int predictedMarks;
	public void update(int marks,int noOfsub) {
		this.marksRate=marks/noOfsub;
		this.predictedMarks=marksRate*6;
		display();
	}
	public void display() {
		System.out.println("MarksRate: "+marksRate+"\tpredictedMarks: "+predictedMarks);
	}
}
