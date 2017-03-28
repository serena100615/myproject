package oo.test;

import java.util.ArrayList;

public class Invoice {

	public static void main(String[] args) {
		ArrayList p = new ArrayList();
		p.add("331");
		p.add("821");
		p.add("886");
		p.add("554");
		String s = "331";
		String n = "123456331";
		String sub = n.substring(n.length() - 3);
		System.out.println(sub);
	}

}
