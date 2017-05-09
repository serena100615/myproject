package oo.shopping;

public class SilverCustomer extends Customer {

	public SilverCustomer(int amount) {
		super(amount);
		this.amount = amount;
	}

	public int getAmount(int amo) {
		return amo = (int) (amo * 0.9);
	}

	public void print() {
		System.out.println(getAmount(amount));

	}
}
