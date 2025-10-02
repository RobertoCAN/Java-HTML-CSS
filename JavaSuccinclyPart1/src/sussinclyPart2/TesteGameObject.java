 package sussinclyPart2;

public class TesteGameObject {

	public static void main(String[] args) {
		GameObject[] gameObjects = new GameObject[5];
		
		gameObjects[0] = new Player();
		
		
		for (int i = 1; i < gameObjects.length; i++) {
			gameObjects[i] = new NPC();
		}
		
		for (int i = 0; i < gameObjects.length; i++) {
			gameObjects[i].move();
		}
		
		gameObjects[0].x = 9;
		gameObjects[0].y = 7;
		gameObjects[0].print();
		gameObjects[3].print();

	}

}
