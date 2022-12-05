package com.axis.structural.adapter;

public class AdapterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etv etv=new Etv();
		Youtube youtube=new FilmyChannel();
		Youtube televisionAdapter=new TelevisionAdapter(etv);
		
		System.out.println("=========================Etv==================================");
		etv.movies();
		etv.news();
		
		System.out.println("=======================FilmyChannel==========================");
		youtube.series();
		youtube.documentary();
		
		
		System.out.println("==========================Television Adapter=================");
		televisionAdapter.documentary();
		televisionAdapter.series();
		

	}

}
