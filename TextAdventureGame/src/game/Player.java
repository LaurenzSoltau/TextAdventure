package game;

import java.util.ArrayList;

public class Player {

	// stats
	int lives;
	int damage;
	int defense;
	int currentLocation;
	ArrayList<Item> items;
	
	
	String name;
	
	public Player(String name) {
		this.name = name;
		this.items = new ArrayList<Item>();
		this.lives = 10;
		this.damage = 2;
		this.defense = 4;
		this.currentLocation  = -1;
	}
}
