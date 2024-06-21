package componentes;

//Exemplo 2: Componente de Envio de E-mail
public class SmtpEmailComponent implements EmailComponent {
	@Override
	public void sedEmail(String to, String subject, String body) {
		// TODO Auto-generated method stub
		System.out.println("Enviando e-mail para: " + to + " com assunto: " + subject + "\n" + body);
	}
}
