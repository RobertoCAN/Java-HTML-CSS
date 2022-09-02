package certificacao;

public class TestaCicloDeVida {
	public static void main(String[] args) {
		Carro c = new Carro();
		c.ano = 2022;
		c.modelo = "ford ka";
		c.preco = 50000;
		c.desc = null;
	
		//c= new Carro();
		c.metodo(c);

		System.out.println(c.modelo +" "+ c.ano);
		
		//c = null;
		System.out.println("Tipos de dados em Java: \n" +
	            "\nMenor Byte: " + Byte.MIN_VALUE +
	            "\nMaior Byte: " + Byte.MAX_VALUE +
	            "\nMenor Short Int: " + Short.MIN_VALUE +
	            "\nMaior Short Int: " + Short.MAX_VALUE +
	            "\nMenor Int: " + Integer.MIN_VALUE +
	            "\nMaior Int: " + Integer.MAX_VALUE +
	            "\nMenor Long: " + Long.MIN_VALUE +
	            "\nMaior Long:" + Long.MAX_VALUE +
	            "\nMenor Float: " + Float.MIN_VALUE +
	            "\nMaior Float: " + Float.MAX_VALUE +
	            "\nMenor Double: " + Double.MIN_VALUE +
	            "\nMaior Double: " + Double.MAX_VALUE);

        int $$ = 5;
        int G = $$++;
        System.out.println(G);
        if (G < ++$$ || G-- > $$) {
        	System.out.println(G);
            System.out.print("A");
        }
        System.out.print($$);
        System.out.print(G);

        int i;
        for (i = 0; i < 5; i++) {
            if (++i % 3 == 0) {
                break;
            }
        }
        System.out.println(i);
        
        int y = 0;
        for(int x = 0; x<10; ++x) {
          y = x % 5 + 2;
        }
        System.out.println(y);

	}
}
