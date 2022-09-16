package game;

import java.util.Random;

public class Item {

	static int itemCount;
	String itemName;
	int addlives;
	int adddamage;
	int adddefense;
	int tier;
	int exp;
	int expLevel2 = 100;
	int expLevel3 = 500;
	Random rand = new Random();

	
	public Item(int tier) {
		this.itemName = "item" + itemCount;
		itemCount++;
		this.tier = tier;
		this.exp = 0;
		if (tier == 1) {
			int max = 5 * tier;
			int min = 1;
			this.addlives = rand.nextInt(max) + min;
			this.adddamage = rand.nextInt(max) + min;
			this.adddefense = rand.nextInt(max) + min;
			
		}
		
		if (tier  == 2) {
			int max = 5 * tier;
			int min = 5;
			this.addlives = rand.nextInt(max) + min;
			this.adddamage = rand.nextInt(max) + min;
			this.adddefense = rand.nextInt(max) + min;
		}
		if (tier  == 3) {
			int max = 5 * tier;
			int min = 10;
			this.addlives = rand.nextInt(max) + min;
			this.adddamage = rand.nextInt(max) + min;
			this.adddefense = rand.nextInt(max) + min;
		}
	}
	
	public static Item nextItem() {
		int nextTier;
		int rand = (int)(Math.random() * 10) + 1;
		if (rand < 4) {
			nextTier = 2;
		} else {
			nextTier = 1;
		}
		return new Item(nextTier);
	}
}
