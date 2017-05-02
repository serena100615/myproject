package oo.test;

import java.util.ArrayList;

import oo.abstraction.Car;
import oo.staticc.GraduateStudent;
import oo.staticc.Student;

public class Tester {

	public static void main(String[] args) {
		Car c = new Car("brand", 2000, "name", "type");
		ArrayList<String> a = new ArrayList();
 	 // String[] numbers= {"331","821","886"};
		a.add("331");
		a.add("821");
     // a.add(123);
		a.add("886");
   	 // a.add(true);
		System.out.println(a.size());
		a.add("554");
		System.out.println(a.size());
		a.set(2, "885");
		System.out.println(a);
		String data = a.get(3);
	 // int n = (int)a.get(4);
		
	ArrayList<Student> list = new ArrayList<>();
	list.add(new Student(58, 98,66));
	list.add(new Student(67,56,77));
	list.add(new Student(88,99,50));
	list.add(new GraduateStudent(66,87,66));
	list.add(new GraduateStudent(78,89,60));
	for (int i=0;i<list.size();i++){
		Student stu = list.get(i);
		stu.print();
	}
		
	}

}
