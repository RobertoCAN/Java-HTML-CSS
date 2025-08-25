package circle;

public class TesteCircle {
	public static void main(String args[]) {
		
		Circle[] circlesArray = new Circle[100];
		
		circle
		
		for(int i= 0; i < 100; i++) {
			circlesArray[i] = new Circle();
			circlesArray[i].setRadius((float)(i));
		}
		System.out.println("CircleArray[20] Radius: " + circlesArray[20].getRadius());
		System.out.println("CircleArray[30] Radius: " + circlesArray[30].getRadius());
		System.out.println("CircleArray[0] Radius: " + circlesArray[0].getRadius());
		System.out.println("CircleArray[1] Radius: " + circlesArray[1].getRadius());
		
		
	}
}