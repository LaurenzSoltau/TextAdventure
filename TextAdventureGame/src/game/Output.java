package game;


public class Output {
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
		
	}
}
