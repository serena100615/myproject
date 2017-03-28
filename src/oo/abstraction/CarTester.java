package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		Car car1 = new Car("toyota", 1800, "altis", "sedan");
		Car car2 = new Car("honda", 2000, "accord", "sedan");
		Car car3 = new Car("toyota", 2000, "wish", "sedan");

		int[] n = new int[5];
		System.out.println(n[2]);
		
		Car[] cars = new Car[3];
		System.out.println(cars[0]);
		cars[0] = new Car("toyota", 1800, "altis", "sedan");
		cars[1] = new Car("honda", 2000, "accord", "sedan");
		cars[2] = new Car("toyota", 2000, "wish", "sedan");
		cars[0].id = 301;
		cars[1].id = 400;
		cars[2].id = 403;
		
		System.out.println(cars[0].name);
		int i = 0;
		for (i = 0; i < 3; i++) {
			System.out.println(cars[i].name);
		}
		
		

	class AA {

	}

	AA a = new AA();
}
}
