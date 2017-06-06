package oo.shopping2;

public class SilverCustomer extends Customer{
	public SilverCustomer(int amount) {
		super(amount);
		this.amount = amount;
	}

	public double getAmount(double amo) {
		return amo = (amo * 0.9);
	}

	@Override
	public void print() {
		System.out.println(amount+"\t"+getAmount(amount)+"\t0");
	}

}
