package oo.test;

import java.util.ArrayList;

import oo.abstraction.Car;

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
	}

}
