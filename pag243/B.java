package pag243;

public class B extends A{
	int k;
	B(int a, int b, int c){
		super(a, b);
		k = c;
	}
	
	//exibe k - esta vers�o sobrep�e show() em A
	
	void show() {
		super.show();
		System.out.println("k: " + k);
	}
}
