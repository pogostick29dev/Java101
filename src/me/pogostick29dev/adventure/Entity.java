package me.pogostick29dev.adventure;

public class Entity {

	private int health;
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int h) {
		health = h;
	}
	
	public void modifyHealth(int h) {
		health += h;
	}
}