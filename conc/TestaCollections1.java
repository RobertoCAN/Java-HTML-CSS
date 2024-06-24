package conc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestaCollections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Aluno> alunos = new ArrayList<Aluno>();

		alunos.add(new Aluno("Carmoza", "ce", 18, false));
		alunos.add(new Aluno("Roberto", "RS", 41, false));
		alunos.add(new Aluno("caetano", "RS", 41, false));
		alunos.add(new Aluno("Neto", "RS", 41, false));
		alunos.add(new Aluno("ricardo", "ce", 14, false));
		alunos.add(new Aluno("Jonathan", "SP", 42, false));
		alunos.add(new Aluno("Luiz", "ce", 82, false));

		
		Map<String, List<Aluno>> mapaDeAlunosPorEstados = new HashMap<>();
		
		mapaDeAlunosPorEstados.put("RS", Arrays.asList(new Aluno("Carmoza", "ce", 18, false), 
				new Aluno("Roberto", "RS", 41, false)));
		
//		List<Aluno> alunosDF = new ArrayList<Aluno>();
//
//		for (Aluno aluno : alunos) {
//			if (aluno.getEstado().equals("RS")) {
//				alunosDF.add(aluno);
//			}
//		}
//		System.out.println(alunosDF);

	}

}
