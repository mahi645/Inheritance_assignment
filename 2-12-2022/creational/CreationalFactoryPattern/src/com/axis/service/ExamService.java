package com.axis.service;
import com.axis.modal.*;
import com.axis.design.*;
import com.axis.util.*;
public class ExamService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExamFactory examFactory=new ExamFactory();
		Exam exam=examFactory.examTable("Maths");
		exam.examType();
		
	}

}
