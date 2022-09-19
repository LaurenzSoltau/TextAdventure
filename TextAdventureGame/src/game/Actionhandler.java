package game;

import java.util.Scanner;

public class Actionhandler {
	Output out = new Output();
	static String[] commands = {"commands", "stats", "exit", "gooutlands", "gotown", "goarena", "printshop",
			"buyitem", "showinv"};
	static String[] fightcommands = {""};
	
	public void chooseHandler(String command, Player user, Town town, Scanner in, Outlands outlands) {
		if (command.equals("exit")) {
			exitGame();
		}	
		else if (command.equals("commands")) {
			commands();
		}
		else if (command.equals("stats")) {
			stats(user);
		} else if (command.equals("gotown")) {
			goTown(town, user);
		} else if(command.equals("printshop")) {
			if (user.currentLocation != 0) {
				System.out.println("Du musst in der Stadt sein, um das zu tun.");
				return;
			}
			town.vendor.printShop();
		} else if (command.equals("buyitem")) {
			if (user.currentLocation != 0) {
				System.out.println("Du musst in der Stadt sein, um das zu tun.");
				return;
			}
			buyItem(user, town, in);
		} else if (command.equals("showinv")) {
			showinv(user);
		} else if (command.equals("gooutlands")) {
			gooutlands(outlands, user);
		}
		else {
			out.printCommandError();
		}
	}
	

	private void gooutlands(Outlands outlands, Player user) {
			if (user.currentLocation == 1) {
				System.out.println("Du bist schon in den Outlands");
				return;
			}
			user.currentLocation = 1;
			outlands.hunter.talk();
	}


	public void exitGame() {
		System.out.println("Das Spiel wird beendet.");
		System.exit(0);
	}
	
	public void commands() {
		out.printCommands();
	}
	
	public void stats(Player user) {
		out.printStats(user);
	}
	
	public void goTown(Town town, Player user) {
		if (user.currentLocation == 0) {
			System.out.println("Du bist schon in der Stadt");
			return;
		}
		user.currentLocation = 0;
		town.vendor.talk();
	} 
	
	
	public void buyItem(Player user, Town town, Scanner in) {
		if (town.vendor.sufficientGoldandSpace(user, in)) {
			if (user.items.size() > 2) {
				System.out.println("Gib '1' '2' oder '3' ein, um das Item zu tauschen.");
				int slot = in.nextInt() - 1;
				if (slot > 2) {
					System.out.println("Den Slot gibt es nicht, der Vorgang wurde abgebrochen.");
					return;
				}
				user.items.remove(slot);
				user.update(user);
				Item boughtItem = town.vendor.buyItem();
				user.gold -= boughtItem.price;
				user.items.add(slot, boughtItem);
				out.printBoughtItem();
				user.update(user);
			} else {
				Item boughtItem = town.vendor.buyItem();
				user.gold -= boughtItem.price;
				user.items.add(boughtItem);
				out.printBoughtItem();
				user.update(user);
			}
		}
	}
	
	private void showinv(Player user) {
		System.out.println("Hier ist dein Inventar:");
		for (Item item : user.items) {
			System.out.println(item.itemName);
			System.out.println("+lives: " + item.addlives + "\n+damage: "+item.adddamage +
					"\n+defense: " + item.adddefense + "\nPreis: " + item.price);
			System.out.println();
		}
	}
}
