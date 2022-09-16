package game;

import java.util.Scanner;

public class Game {
	Scanner in;
	boolean gameRunning;
	Output out;
	Player user;
	Actionhandler handler;

	
	public Game() {
		this.gameRunning = true;
		this.in = new Scanner(System.in);
		this.out = new Output();
		this.handler = new Actionhandler();
	}
	public void runGame() {
		String currentCommand;
		out.printStartMessage();
		this.user = new Player(in.nextLine());
		while (gameRunning) {
			out.printPrompt();
			currentCommand = in.next();
			handler.chooseHandler(currentCommand, user);
			
			
		}
	}
	
}
