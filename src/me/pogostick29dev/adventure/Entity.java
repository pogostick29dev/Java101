package me.pogostick29dev.adventure;

public class Entity {

	private int health;
	
	public Entity(int h) {
		health = h;
	}
	
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