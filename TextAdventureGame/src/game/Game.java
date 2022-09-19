package game;

import java.util.Scanner;

public class Game {
	Scanner in;
	boolean gameRunning;
	Output out;
	Player user;
	Actionhandler handler;
	Town town;
	Outlands outlands;

	
	public Game() {
		this.gameRunning = true;
		this.in = new Scanner(System.in);
		this.out = new Output();
		this.handler = new Actionhandler();
		this.town = new Town();
		this.outlands = new Outlands();
	}
	public void runGame() {
		String currentCommand;
		out.printStartMessage();
		this.user = new Player(in.nextLine());
		System.out.println("Hallo, " + user.name + " Dein Character wurde erfolgreich erstellt. Gib stats ein, um deine Werte zu sehen");
		while (gameRunning) {
			out.printPrompt();
			currentCommand = in.next();
			handler.chooseHandler(currentCommand, user, town, in, outlands);
			
			
		}
	}
	
}
