package game;



public class Vendor extends Npc {
	Item nextItemVendor;
	String name = "Benny der Verkäufer";
	boolean talkedTo = false;
	
	
	public void talk() {
		if (!talkedTo) {
			System.out.println("Hallo, du bist das erste mal in der Stadt");
			System.out.println("Ich bin " + name + "." + " Bei mir kannst du Items kaufen.");
			this.newShop();
		} else {
			System.out.println("Willkommen zurück. Ich hoffe du hattest eine gute Reise!");
		}
	}
	
	public void newShop() {
		this.nextItemVendor = Item.nextItem();
	}
	
	public void printShop() {
		System.out.println("So So, du willst also etwas Kaufen, schauen wir mal was ich im Angebot habe");
		System.out.println("Ich verkaufe dir: " + this.nextItemVendor.itemName + "\nDas sind die Stats: \n"
				+ "+lives: " + this.nextItemVendor.addlives + "\n+damage: "+this.nextItemVendor.adddamage +
				"\n+defense: " + this.nextItemVendor.adddefense);
	}
}
