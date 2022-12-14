package game;

import java.util.Scanner;

public class Vendor extends Npc {
	Item nextItemVendor;
	String name = "Benny der Verkäufer";
	boolean talkedTo = false;
	
	
	public void talk() {
		if (!talkedTo) {
			System.out.println("Hallo, du bist das erste mal in der Stadt");
			System.out.println("Ich bin " + name + "." + " Bei mir kannst du Items kaufen.");
			this.newShop();
			this.talkedTo = true;
		} else {
			System.out.println("Willkommen zurück in der Stadt. Ich hoffe du hattest eine gute Reise!");
		}
	}
	
	public void newShop() {
		this.nextItemVendor = Item.nextItem();
	}
	
	public void printShop() {
		System.out.println("So So, du willst also etwas Kaufen, schauen wir mal was ich im Angebot habe");
		System.out.println("Ich verkaufe dir: " + this.nextItemVendor.itemName + "\nDas sind die Stats: \n"
				+ "+lives: " + this.nextItemVendor.addlives + "\n+damage: "+this.nextItemVendor.adddamage +
				"\n+defense: " + this.nextItemVendor.adddefense + "\nPreis: " + this.nextItemVendor.price);
	}
	
	public Item buyItem() {
		Item boughtItem = this.nextItemVendor;
		this.newShop();
		return boughtItem;
	}
	
	public boolean sufficientGoldandSpace(Player user, Scanner in) {
		if (user.gold < this.nextItemVendor.price) {
			System.out.println("Du hast nicht genug Gold!");
			return false;
		}
		if (user.items.size() > 2) {
			
			System.out.println("Dein Inventar ist voll. Tippe 'n' ein, wenn du den Kauf abbrechen willst.");
			System.out.println("Wenn du ein Item austauschen willst tippe 't'");
			String answer = in.next();
			if (answer.equals("n")) {
				return false;
			}
			if (!answer.equals("n") && !answer.equals("t")) {
				return false;
			}
		}
		return true;
	}
}
