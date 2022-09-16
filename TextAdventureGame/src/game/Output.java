package game;


public class Output {
	String[] commands = {"commands", "stats", "exit", "gooutlands", "gotown", "goarena"};
	public void printStartMessage() {
		System.out.println("Willkommen in ESCAPE. In diesem Textadventure musst du Gold durch Quests, "
				+ "Monster und Arenen Kämpfen bekommen, um dich in der Stadt freizukaufen.");
		System.out.println("Gib zum starten deinen Namen ein");
	}
	
	public void printStats(Player user) {
		System.out.println("Stats: ");
		System.out.println("lives: " + user.lives + "\n" + "damage: " + user.damage + "\n" + "defense: " + user.defense + "\n");
	}
	
	public void printCommands() {
		System.out.println("Du hast die folgenden Commands zur Verfügung. Du kannst commands nur angeben wenn du dieses Symbol siehst >");
		for (String command : commands) {
			System.out.print(command + ", ");	
		}
		System.out.println();
	}
	
	public void printPrompt() {
		System.out.print("> ");
	}
	
	public void printCommandError() {
		System.out.println("Den command gibt es nicht oder du hast ihn falsch geschrieben. \nGib "
				+ "commands ein um zu sehen welche commands es gibt.");
	}
}
