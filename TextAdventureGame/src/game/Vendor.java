package game;

public class Vendor extends Npc {
	String name = "Benny the vendor";
	boolean talkedTo = false;
	public void talk() {
		if (!talkedTo) {
			System.out.println("Hi, you arrived in the Town the first time.");
			System.out.println("I am " + name + "." + " Here you can buy items.");
		} else {
			System.out.println("Welcome back in the town. I hope you had a good journey.");
		}
	}
}
