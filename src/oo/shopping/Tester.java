package oo.shopping;

public class Tester {

	public static void main(String[] args) {
		Customer cus1= new Customer(6000);
		cus1.print();
		SilverCustomer cus2 = new SilverCustomer(8000);
		cus2.print();
		SilverCustomer cus3 = new SilverCustomer(10000);
		cus3.print();
		GoldenCustomer cus4 = new GoldenCustomer(30000);
		cus4.print();
		Customer cus5= new Customer(2000);
		cus5.print();
		GoldenCustomer cus6 = new GoldenCustomer(10000);
		cus6.print();
	}

}
