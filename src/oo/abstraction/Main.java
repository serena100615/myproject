package oo.abstraction;

public class Main {

	public static void main(String[] args) {
          
		Car c = new Car("brand",2000,"name","type");
		c.setMilage(25000);
		//
		float current = c.addMilage(80);
		System.out.println("目前里成為:"+current);
	}

}
