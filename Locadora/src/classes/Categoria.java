package classes;

public class Categoria {
	
	private String nome;
	private String preco;
	
	public Categoria(String nome, String preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPreco() {
		return preco;
	}

	public void setCpf(String preco) {
		this.preco = preco;
	}

}