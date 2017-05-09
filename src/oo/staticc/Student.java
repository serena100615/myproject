package oo.staticc;

import java.util.ArrayList;

public class Student {

	int english;
	int math;
	int chinese;
	static int pass = 60;
	static {
		System.out.println("STATIC!!!");
//		System.out.println(english); why?
		System.out.println(pass);
	}
	
	Student(){
		
	}


public Student(int english, int math, int chinese) {
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}

	/*
	 * public void print(){
	 * System.out.println(english+"\t"+math+"\t"+chinese+"\t"); }
	 */
	public void print() {
		System.out.println(getScore(english) + "\t" + getScore(math) + "\t" + getScore(chinese));
	}

	protected String getScore(int score) {
		if (score < pass) {
			return String.valueOf(score) + "*";
		} else {
			return String.valueOf(score);
		}
	}
	@Override
	public String toString(){
		return
				"eng:"+english+"\n"+"math:"+math+"\n"+"chinese:"+chinese;
	}
}
