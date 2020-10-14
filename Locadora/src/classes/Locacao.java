package classes;

public class Locacao {
	
	private String filme;
	private Genero genero;
	private String locacao;
	private String devolucao;
	private Integer id;
	static int contador = 0;
	
	public Locacao(String filme, Genero genero, String locacao, String devolucao) {
		super();
		this.filme = filme;
		this.genero = genero;
		this.locacao = locacao;
		this.devolucao = devolucao;
		this.id = contador++;
	}

	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}
	
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public String getLocacao() {
		return locacao;
	}

	public void setLocacao(String locacao) {
		this.locacao = locacao;
	}
	
	public String getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(String devolucao) {
		this.devolucao = devolucao;
	}
	
	public Integer getId() {
		return id;
	}
}
