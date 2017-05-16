package oo.shopping;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		System.out.println("原價"+"\t"+"折扣後"+"\t"+"還原金");
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(new Customer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new SilverCustomer(10000));
		list.add(new GoldenCustomer(30000));
		list.add(new Customer(2000));
		list.add(new GoldenCustomer(10000));
		for(int i=0; i<list.size();i++){
			Customer cust=list.get(i);
			/*	if(cust instanceof SilverCustomer&&!(cust instanceof GoldenCustomer)){
						System.out.println("*");
					}*/
			cust.print();
		}
		
		/*Customer cus1= new Customer(6000);
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
		cus6.print();*/
	}

}
