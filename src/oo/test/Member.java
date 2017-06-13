package oo.test;

public class Member {
	String nmae;
	int age;
	String id;
	
	public Member(){
		System.out.println("member constructor");
	}
	 void setAge(int age){
		if(age<0){
			age =0;
			}
	this.age = age; 	
	}
	public int getAge(){
		return age;
	}
}
