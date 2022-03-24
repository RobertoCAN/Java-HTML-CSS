package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Teste");
		
		Usuario u1 = new Usuario();
		u1.setLogin("Roberto");
		u1.setSenha("123456");
		
		Usuario u2 = new Usuario();
		u2.setLogin("Caetano");
		u1.setSenha("123456");

		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
		
		lista.add(empresa);
		lista.add(empresa2);

	}

	public void adciona(Empresa empresa) {
		// TODO Auto-generated method stub
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();

		while (it.hasNext()) {
			Empresa emp = it.next();
			if (emp.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	public Usuario existeUsuário(String login, String senha) {
		for(Usuario usuario : listaUsuarios) {
	        if(usuario.ehIgual(login, senha)) { 
	            return usuario;
	        }
	    }
		return null;
	}

}