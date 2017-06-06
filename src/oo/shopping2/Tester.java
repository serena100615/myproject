package oo.shopping2;

import java.util.ArrayList;

import oo.shopping.Customer;
import oo.shopping.GoldenCustomer;
import oo.shopping.SilverCustomer;

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
	}

}
