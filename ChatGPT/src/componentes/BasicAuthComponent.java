package componentes;

//Exemplo 1: Componente de Autentica��o
public class BasicAuthComponent implements AuthCompoenent {

	@Override
	public boolean authenticade(String username, String password) {
		// TODO Auto-generated method stub
		return "user".equals(username) && "pass".equals(password);
	}

}
