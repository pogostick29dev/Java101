package me.pogostick29dev.adventure;

public abstract class Entity implements Damageable {

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
	
	public abstract String getType();
}