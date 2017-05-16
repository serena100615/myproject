package oo.shopping;

public class GoldenCustomer extends SilverCustomer{
	public GoldenCustomer(int amount) {
		super(amount);
		this.amount = amount;
		
	}
	public double getAmount(double amo) {
		return amo = (amo * 0.9);
	}
	public double getReturn(double ret) {
		return ret = (ret * 0.05);
	}

	public void print() {
		System.out.println("金級會員"+" 消費:"+amount+" 折扣:"+getAmount(amount)+" 還原金:"+getReturn(amount));

	}
}
