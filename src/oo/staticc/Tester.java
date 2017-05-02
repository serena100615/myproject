package oo.staticc;

public class Tester {

	public static void main(String[] args) {
		System.out.println(Student.pass);
		Student stu = new Student(); 
		Student stu1 = new Student(58, 98, 66);
		Student stu2 = new Student(67, 56, 77);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
		GraduateStudent gstu = new GraduateStudent(65,85,89,45);
		gstu.print();
	}

}
