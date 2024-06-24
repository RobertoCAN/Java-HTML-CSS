package conc;

public class B extends A {
	int i ;
	
	B(int a, int b){
		super.i = a;
		
		i = b;
	}
	
	void show(){
		System.out.println("i é superclasse: " + super.i);
		System.out.println("i e subclasse: " + i);
	}
}
