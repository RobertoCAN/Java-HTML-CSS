package factoryMethod;

public class Main {

	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		creator.someOperation();
		
		ConcreteCreator concreteCreator = new ConcreteCreator();
		concreteCreator.factoryMethod().operation();
	}

}
