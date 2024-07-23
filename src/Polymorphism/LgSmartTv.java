package Polymorphism;

public class LgSmartTv extends LgOldTv {
	@Override
	public void changeChannel() {
	System.out.println("Channe1 Changed in smart way");
	}
	public void playGame() {
	System.out.println("Game Starts");
	}
}
