package sussinclyPart2;

public class NPC extends GameObject {

	@Override
	public void move() {
		System.out.println("The shopkeeper wanders around aimlessly...");
	}
	
	@Override
	public String teste() {
    //System.out.println("Testeando outro m�todo abstrato.");
		return "Testeando outro m�todo abstrato.!!!";
	}
	
	@Override
	public String toString() {
		return teste();
	}
}
