package me.pogostick29dev.adventure;

public class Monster extends Entity {

	private int level;
	
	public Monster(int level) {
		setHealth(level * 2);
	}
	
	public int getLevel() {
		return level;
	}
}