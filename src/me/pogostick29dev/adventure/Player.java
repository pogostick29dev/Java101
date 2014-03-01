package me.pogostick29dev.adventure;

public class Player extends Entity {

	private String name;
	private double money;
	
	public Player(String n) {
		name = n;
		setHealth(10);
		money = 19.99;
	}
	
	public String getName() {
		return name;
	}
	
	public double getMoney() {
		return money;
	}
	
	public void setMoney(double m) {
		money = m;
	}
	
	public void modifyMoney(double m) {
		money += m;
	}
}