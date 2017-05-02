package oo.staticc;

public class GraduateStudent extends Student {
int thesis;

public GraduateStudent(int english, int math, int chinese, int thesis) {
	super( english, math, chinese);
	this.thesis = thesis;
}
}
