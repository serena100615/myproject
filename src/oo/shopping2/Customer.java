package oo.shopping2;

public abstract class Customer {
	int amount;

	public Customer(int amount) {
		this.amount = amount;

	}
	public abstract void print();
}
