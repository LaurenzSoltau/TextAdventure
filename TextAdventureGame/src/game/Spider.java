package game;

public class Spider extends Enemy {

	@Override
	public int attack1(int dodge) {
		if (dodge == 3) {
			System.out.println("AHHH Nein");
			System.out.println("Du bist ausgewichen und hast keine Leben verloren");
			return 0;
		}
		System.out.println("MUHAHA");
		System.out.println("Du wurdest gebissen und hast 5 Leben verloren");
		return 5;
	}

	@Override
	public int attack2(int dodge) {
		if (dodge == 2) {
			return 4;
		}
		return 8;
	}

	@Override
	public int attack3(int dodge) {
		if (dodge == 1) {
			return 2;
		}
		return 10;
	}

	@Override
	public void talk() {
		System.out.println("Ich werde dich aufessen, du hast keine Chance gegen meine Netze");
		
	}
	
}
