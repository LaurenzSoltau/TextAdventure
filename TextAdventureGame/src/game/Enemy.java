package game;

public abstract class Enemy {
	public int lives;
	public int expDrop;
	public int damage;
	public abstract int attack1(int dodge);
	public abstract int attack2(int dodge);
	public abstract int attack3(int dodge);
	public abstract void talk();

	
}
