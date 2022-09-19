package game;

public class Hunter extends Npc {
	boolean talkedTo = false; 
	String name = "Patrick der Jäger";
	@Override
	public void talk() {
			if (!talkedTo) {
				System.out.println("Hallo, du betritts das erste Mal die Outlands!");
				System.out.println("Ich bin " + name + "." + " Ich führe dich zu Monstern ");
				this.talkedTo = true;
			} else {
				System.out.println("Schön, dass du dich wieder in die Outlands getraut hast");
			}
	}
	public void showEnemy() {
		
	}
}
