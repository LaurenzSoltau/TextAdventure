package game;

import java.util.ArrayList;

public class Player {

	// stats
	int lives;
	int damage;
	int defense;
	int currentLocation;
	int gold;
	ArrayList<Item> items;
	
	
	String name;
	
	public Player(String name) {
		this.name = name;
		this.items = new ArrayList<Item>();
		this.lives = 10;
		this.damage = 2;
		this.gold = 350;
		this.defense = 4;
		this.currentLocation  = -1;
	}
	
	public void update(Player user) {
		this.lives = 10;
		this.damage = 10;
		this.defense = 10;
		for(Item item : user.items) {
			this.lives += item.addlives;
			this.damage += item.adddamage;
			this.defense += item.adddefense;
		}
	}
	
}

