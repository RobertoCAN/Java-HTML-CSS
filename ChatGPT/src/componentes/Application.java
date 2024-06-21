package componentes;
//Integração dos Componentes
public class Application {

	private AuthCompoenent authCompoenent;
	private EmailComponent emailComponent;
	
	public Application(AuthCompoenent authCompoenent, EmailComponent emailComponent) {
		// TODO Auto-generated constructor stub
		this.authCompoenent = authCompoenent;
		this.emailComponent = emailComponent;
	}
	
	public void run() {
		if (authCompoenent.authenticade("user", "pass")) {
			emailComponent.sedEmail("example@example.com.br", "Assunto", "corpo do email aqui!!!");
		}else {
			System.out.println("Usuário ou senha incorreta!!!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		AuthCompoenent auth = new BasicAuthComponent();
		EmailComponent email = new SmtpEmailComponent();
		Application app = new Application(auth, email);
		app.run();
	}

}
