package game;

public class Actionhandler {
	Output out = new Output();
	String[] commands = {"commands", "stats", "exit", "gooutlands", "gotown", "goarena"};
	
	public void chooseHandler(String command, Player user, Town town) {
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
}
