package Entites;

import Abstract.Entity;

public class Campaign implements Entity{
	private String name;
	private int discountPercent;

	public Campaign() {
	}
	
	public Campaign(String name, int discountPercent) {
		super();
		this.name = name;
		this.discountPercent = discountPercent;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
}
