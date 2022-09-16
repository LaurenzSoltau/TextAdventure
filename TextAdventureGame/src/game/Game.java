package game;

import java.util.Scanner;

public class Game {
	Scanner in;
	boolean gameRunning;
	Output out;
	Player user;

	
	public Game() {
		this.gameRunning = true;
		this.in = new Scanner(System.in);
		this.out = new Output();
		
	}
	public void runGame() {
		
		out.printStartMessage();
		this.user = new Player(in.nextLine());
		while (gameRunning) {
		
		}
	}
}
