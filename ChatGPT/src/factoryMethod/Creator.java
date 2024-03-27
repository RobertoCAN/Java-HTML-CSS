package factoryMethod;

abstract class Creator {
	//O metodo Factory
	abstract Product factoryMethod();
	
	//Metodo que utiliza o Factory Method
	public void someOperation() {
		Product product = factoryMethod();
		product.operation();
	}
}
