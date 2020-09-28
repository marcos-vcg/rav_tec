package arrays;

public class ArrayDeArrays {

	public static void main(String[] args) {
		Object[] base = new Object[2];
		String[] cliente = new String[2];
		base[0] = cliente;
		cliente[0] = "Nome";
		cliente[1] = "Sobrenome";
		String[] conta = new String[1];
		base[1] = conta;
		conta[0] = "100";
		String[] endereco = new String[1];
		base[2] = endereco;
		endereco[0] = "Rua tal ";
		
		
		for(int i = 0; i<base.length; i++) {
			for(int j = 0; j<base[i].length; j++) {
			System.out.println("Linha " +i+ " Coluna " + j + " igual a " + base[i]);
			}

		}
	}

}
