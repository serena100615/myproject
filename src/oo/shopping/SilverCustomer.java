package oo.shopping;

public class SilverCustomer extends Customer {

	public SilverCustomer(int amount) {
		super(amount);
		this.amount = amount;
	}

	public double getAmount(double amo) {
		return amo = (amo * 0.9);
	}

	public void print() {
		System.out.println("銀級會員"+" 消費:"+amount+" 折扣:"+getAmount(amount));

	}
}
