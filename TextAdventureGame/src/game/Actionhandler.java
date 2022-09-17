package game;

import java.util.Scanner;

public class Actionhandler {
	Output out = new Output();
	static String[] commands = {"commands", "stats", "exit", "gooutlands", "gotown", "goarena", "printshop",
			"buyitem"};
	
	public void chooseHandler(String command, Player user, Town town, Scanner in) {
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
		}
		else {
			out.printCommandError();
		}
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
				user.items.remove(0);
				user.update(user);
				Item boughtItem = town.vendor.buyItem();
				user.gold -= boughtItem.price;
				user.items.add(0, boughtItem);
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
	
}
