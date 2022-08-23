package edu.kh.poly.ex1.model.vo;

public class Spark extends Car{
	private double discountOffers;
	
	public Spark() {}

	public Spark(int wheel, int seat, String fuel, double discountOffers) {
		super(wheel, seat, fuel);
		this.discountOffers = discountOffers;
	}

	public double getDiscountOffers() {
		return discountOffers;
	}

	public void setDiscountOffers(double discountOffers) {
		this.discountOffers = discountOffers;
	}
	
	@Override
	public String toString() {
		return super.toString()+" / 할인혜택 : " + discountOffers;
	}
	
	public void dc() {
		System.out.println(discountOffers*100+"% 할인됩니다.");
	}
	
}
