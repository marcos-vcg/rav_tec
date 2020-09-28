package principal;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		listaClientes.add(new Cliente("teste", "111"));
		listaClientes.add(addCliente("teste", "numero", null, null));
		Cliente.addCliente("carlos", "222");
		
	}

	
	public static Cliente addCliente(String nome, String cpf, String telefone, String email) {
		Cliente cliente = new Cliente(nome, cpf);
		cliente.setTelefone(telefone);
		cliente.setEmail(email);
		return cliente;
	}
}
