package sussinclyPart2;

public class Player extends GameObject {
	@Override
	public void move() {
		System.out.println("It is the player is move...");

	}

	@Override
	public void print() {
		System.out.println("Position: " + x + ", " + y);
	}
}
