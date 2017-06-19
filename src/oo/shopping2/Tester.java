package oo.shopping2;

import java.util.ArrayList;

import oo.shopping.Customer;
import oo.shopping.GoldenCustomer;
import oo.shopping.SilverCustomer;

public class Tester {

	
		public static void main(String[] args) {
			System.out.println("原價"+"\t"+"折扣後"+"\t"+"還原金");
			ArrayList<oo.shopping2.Customer> list = new ArrayList<oo.shopping2.Customer>();
			list.add(new NormalCustomer(6000));
			list.add(new oo.shopping2.SilverCustomer(8000));
			list.add(new oo.shopping2.SilverCustomer(10000));
			list.add(new GoddenCustomer(15000));
			list.add(new NormalCustomer(2000));
			list.add(new GoddenCustomer(10000));
			for(int i=0; i<list.size();i++){
				oo.shopping2.Customer cust=list.get(i);
				/*	if(cust instanceof SilverCustomer&&!(cust instanceof GoldenCustomer)){
							System.out.println("*");
						}*/
				cust.print();
			}
	}

}
