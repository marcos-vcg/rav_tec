package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;

/**
 * Classe responsável por moldar as Contas do Banco
 *
 * @author Marcos Costa
 */

public class TesteDaConta {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100.0);

		System.out.println(conta.getSaldo());
	}
}
