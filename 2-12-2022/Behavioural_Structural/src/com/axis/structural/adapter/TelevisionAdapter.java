package com.axis.structural.adapter;

public class TelevisionAdapter implements Youtube{
	Television television;
	public TelevisionAdapter(Television television) {
		this.television=television;
	}
	public void series() {
		television.movies();
	}
	public void documentary() {
		television.news();
	}
}
