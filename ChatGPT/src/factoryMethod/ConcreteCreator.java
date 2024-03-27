package factoryMethod;

class ConcreteCreator extends Creator{

	Product factoryMethod() {
		return new ConcreteProduct();
	}
	
}
