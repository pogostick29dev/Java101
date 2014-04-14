package me.pogostick29dev.adventure;

public class Monster extends Entity {

	private int level;
	
	public Monster(int level) {
		super(level * 2);
	}
	
	public int getLevel() {
		return level;
	}
	
	@Override
	public String getType() {
		return "Monster";
	}
}