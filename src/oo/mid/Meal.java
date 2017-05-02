package oo.mid;

public class Meal {
	String name;
	String snack;
	int price;

	public Meal(String name, int price,String snack) {
		this.name = name;
		this.price = price;
		this.snack=snack;
	}

	public int discount() {
		System.out.println();
		int dis =(int)(price*0.9f);
		return dis; 		
	}
}
