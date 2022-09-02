package certificacao;

public class TesteArry3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String[] valores = new String[2];
        valores[0] = "Certificação";
        valores[1] = "Java";
        Object[] vals = (Object[]) valores;
        vals[1] = "Daniela";
        System.out.println(vals[1].equals(valores[1]));

	}

}
