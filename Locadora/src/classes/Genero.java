package classes;

public class Genero {
	
	private String nome;
	private Integer id;
	static int contador = 0;
	
	public Genero(String nome) {
		super();
		this.nome = nome;
		this.id = contador++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public Integer getId() {
		return id;
	}

}