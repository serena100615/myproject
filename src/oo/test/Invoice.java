package oo.test;

import java.util.ArrayList;

import java.util.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;

import javafx.scene.effect.FloatMap;

public class Invoice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList p = new ArrayList();
		p.add("331");
		p.add("821");
		p.add("886");
		p.add("554");
		String a = "331";
		String b = "821";
		String c = "886";
		String d = "554";

		Boolean f = true;
		while (f) {
			System.out.print("請輸入發票號碼:");
			String s = scanner.nextLine();
			String sub = s.substring(s.length() - 3);
			if (sub.equals(a)) {
				System.out.println("您中獎了");
				f = !f;
			} else if (sub.equals(b)) {
				System.out.println("您中獎了");
				f = !f;
			} else if (sub.equals(c)) {
				System.out.println("您中獎了");
				f = !f;
			} else if (sub.equals(d)) {
				System.out.println("您中獎了");
				f = !f;
			}	else{
				System.out.println("摃龜");
			}	
			

		}

	}

}
