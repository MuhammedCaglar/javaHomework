package Entites;

import Abstract.Entity;

public class Game implements Entity {
	private String name;
	private String descripton;
	private int price;
	
	public Game() {
	}
	
	public Game(String name, String descripton, int price) {
		super();
		this.name = name;
		this.descripton = descripton;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescripton() {
		return descripton;
	}
	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
