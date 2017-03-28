package oo.abstraction;

public class GroceryStoreTester {

	public static void main(String[] args) {
		GroceryStore thing1 = new GroceryStore("泰山純水",6,15,20,2017,11,30);
		GroceryStore thing2 = new GroceryStore("中華嫩豆腐",12,10,15,2017,2,27);
		GroceryStore thing3 = new GroceryStore("佛蒙特咖哩(甜味)",10,80,95,2017,6,4);
	
		GroceryStore[] things = new GroceryStore[3];
		System.out.println(things[0]);
		things[0] = new GroceryStore("泰山純水",6,15,20,2017,11,30);
		things[1] = new GroceryStore("中華嫩豆腐",12,10,15,2017,2,27);
		things[2] = new GroceryStore("佛蒙特咖哩(甜味)",10,80,95,2017,6,4);
		
		System.out.println(things[0].name);
		int i = 0;
		for (i = 0; i < 3; i++) {
			System.out.println(things[i].name);
		}
	}

}
