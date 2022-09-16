package game;

public class Item {

	int addlives;
	int adddamage;
	int adddefense;
	
	public Item(int tier) {
		addlives = 5;
		adddamage = 5;
		adddefense = 5;
		
		if (tier  == 2) {
			addlives *= tier;
			adddamage *= tier;
			adddefense *= tier;
		}
		if (tier  == 3) {
			addlives *= tier;
			adddamage *= tier;
			adddefense *= tier;
		}
	}
}
