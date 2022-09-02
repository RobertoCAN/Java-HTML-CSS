package certificacao;

class TestaArray2 {

	public static void main(String[] args) {
		Cliente2[] cliente = new Cliente2[10];
		System.out.println(cliente.length);
		
		for (int i = 0; i < cliente.length; i++) {
			cliente[i] = new Cliente2();
			cliente[i].nome = "Mario";
		}

		for (Cliente2 cliente2 : cliente) {
			System.out.println(cliente2.nome);
		}
		Cliente2 cliente2[] = new Cliente2[5];
		cliente2[0] = new Cliente2();
		cliente2[1] = new ClienteEspecial();
		
		String [] nomes = {"Roberto", "Caetano"};
		Object [] objetos;
		
		objetos = nomes;
		
		for (Object object : objetos) {
			System.out.println(object);
		}
		
		for (Object object : nomes) {
			System.out.println(object);
		}
	}

}

class Cliente2 {
	public String nome;
}

class ClienteEspecial extends Cliente2{
	
}