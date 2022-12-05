package com.axis.util;

import com.axis.design.*;
import com.axis.modal.*;
public class ExamFactory {
	public Exam examTable(String exam) {
		if(exam==null || exam.isEmpty())
			return null;
		switch(exam) {
		case "Maths":
			return new MathsExam();
		case "English":
			return new EnglishExam();
		case "Science" :
			return new ScienceExam();
		default:
			throw new IllegalArgumentException("unknown exam"+exam);
		}
		
	}

}
