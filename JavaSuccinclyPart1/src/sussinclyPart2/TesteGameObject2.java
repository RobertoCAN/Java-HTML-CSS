package sussinclyPart2;

public class TesteGameObject2 {

	public static void main(String[] args) {
		
		GameObject someObject = new Player();
		GameObject someObject2 = new NPC();
		
		if (someObject instanceof GameObject) 
			System.out.println("O objeto � um GameObject!");
		else
			System.out.println("N�o � um GameObject...");

		if (someObject instanceof Player)
			System.out.println("Objeto � um Player!");
		else
			System.out.println("Not a Player...");
		
		if (someObject instanceof NPC)
			System.out.println("O objeto � um NPC.");
		else
			System.out.println("N�o � um NPC...");
		
		if (someObject2 instanceof NPC)
			System.out.println("O objeto � um NPC.");
		else
			System.out.println("N�o � um NPC...");
	}
}