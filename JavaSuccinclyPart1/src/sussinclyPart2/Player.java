package sussinclyPart2;

public class Player extends GameObject {

	public Player() {
		super();
		x = y = 100;
		}
	
	@Override
	public void move() {
		System.out.println("It is the player is move...");

	}
	
	@Override
	public String teste() {
//		System.out.println("Testeando outro m�todo abstrato. Casse palyer");
		return "Testeando outro m�todo abstrato. Casse player";
	}

	@Override
	public void print() {
		System.out.println("Position: " + x + ", " + y);
	}
	
	@Override
	public String toString() {
	
		return teste();
	}
}
