package disciplina;

public class TesteDisciplina {
	public static void main(String[] args) {

		Disciplina disciplina = new Disciplina("Matemática.");
		
		disciplina.adicionarNora(10);
		disciplina.adicionarNora(5);
		disciplina.adicionarNora(8);
		disciplina.adicionarNora(7);
		disciplina.adicionarNora(20);
		disciplina.adicionarNora(6);
		
		System.out.println("Total de notas inseridas: " + disciplina.contarNotasValidas());
		
		System.out.println("Média da matéria: " + disciplina.getNome() + " " + disciplina.calcularMedia());
	}
}
