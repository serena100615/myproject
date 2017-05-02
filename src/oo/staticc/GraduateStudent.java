package oo.staticc;

public class GraduateStudent extends Student {
int thesis;

public GraduateStudent(int english, int math, int chinese) {
	super( english, math, chinese);
	
	this.english = english;
	this.math = math;
	this.chinese = chinese;
}
@Override
public void print() {
	System.out.println(getScore(english) + "\t" + getScore(math) + "\t" + getScore(chinese)+thesis);
}
}
