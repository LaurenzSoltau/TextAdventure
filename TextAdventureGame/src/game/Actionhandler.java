package game;

public class Actionhandler {
	Output out = new Output();
	
	public void chooseHandler(String command, Player user) {
		if (command.equals("exit")) {
			exitGame();
		}	
		if (command.equals("commands")) {
			commands();
		}
		if (command.equals("stats")) {
			stats(user);
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
}
