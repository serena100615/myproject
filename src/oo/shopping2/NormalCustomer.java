package oo.shopping2;

public class NormalCustomer extends Customer {

	public NormalCustomer(int amount) {
		super(amount);
		this.amount=amount;
	}

	@Override
	public void print() {
		System.out.println(amount+"\t"+amount+"\t0");
	}

}
