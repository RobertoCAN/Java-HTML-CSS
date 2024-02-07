package pag243;

public class B1 extends A{

	int k;
	B1(int a, int b, int c){
		super(a, b);
		k = c;
	}
	
	//exibe k - esta versão sobrepõe show() em A
	
	void show(String msg) {
		System.out.println(msg + k);
	}
	
}
