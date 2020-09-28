package br.com.caelum.contas;

import java.util.List;
import java.util.Scanner;

import br.com.caelum.contas.modelo.Conta;

public class ManipuladorDeContas {
	public void salvaDados(Evento evento) {
		List<Conta> contas = evento.getLista("listaContas");
		RepositorioDeContas repositorio = new RepositorioDeContas();
		repositorio.salva(contas);
	}

	public List<Conta> carregaDados() {
		RepositorioDeContas repositorio = new RepositorioDeContas();
		
		Scanner scanner = new Scanner(System.in);
	    String linha = scanner.nextLine();
	    String[] valores = linha.split(",");
	    String tipo = valores[0];
		
		return repositorio.carrega();
	}
}
