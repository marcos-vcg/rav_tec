package principal;

import javax.swing.JOptionPane;

public class Filme {

	private String titulo;
	private String genero;
	private int copias;
	private int alugados = 0;
	private String sinopse;
	private String duracao;
	private String lancamento;
//	private Object imagem;
	private String categoria;

	public Filme(String titulo, String genero, int copias, String lancamento) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.copias = copias;
		this.lancamento = lancamento;
	}

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getCopias() {
		return copias;
	}

	public void setCopias(int copias) {
		this.copias = copias;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}

/*	public Object getImagem() {
		return imagem;
	}

	public void setImagem(Object imagem) {
		this.imagem = imagem;
	}
*/
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public int getAlugados() {
		return alugados;
	}


	public void setAlugados(int alugados) {
		this.alugados = alugados;
	}
	
	public void alugar(int quantidade) {
		if(quantidade + alugados >= copias) {
			JOptionPane.showMessageDialog(null, "Disponíveis apenas "+(copias - alugados), "Quantidade Indisponível!", JOptionPane.WARNING_MESSAGE);	
		}
	}
	
}
