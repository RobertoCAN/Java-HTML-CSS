package conc;

public class TruckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
		
		double gallons;
		int distancia = 252;
		
		gallons = semi.CombustivelNecessario(distancia);
		
		System.out.println("Semi pode carregar " + semi.getCarga() + " libras.");
		System.out.println("Para ir " + distancia+ " milhas semi precisa " + gallons + " galãoes de combustível.");
		
		gallons = pickup.CombustivelNecessario(distancia);
		System.out.println("Pickup pode carregar " + pickup.getCarga() + " libras.");
		System.out.println("Para ir " + distancia+ " milhas pickup precisa " + gallons + " galãoes de combustível.");
		
	}

}
