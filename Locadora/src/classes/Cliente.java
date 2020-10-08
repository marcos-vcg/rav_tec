package classes;

import javax.swing.Icon;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String nascimento;
	private String endereco;
	private Icon imagem;
	private Dependente dependente1;
	private Dependente dependente2;
	private Dependente dependente3;
	private Integer id;
	static int contador = 0;

	public Cliente(String nome, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.id = contador++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Icon getImagem() {
		return imagem;
	}

	public void setImagem(Icon imagem) {
		this.imagem = imagem;
	}

	public Dependente getDependente1() {
		return dependente1;
	}

	public void setDependente1(Dependente dependente1) {
		this.dependente1 = dependente1;
	}
	
	public Dependente getDependente2() {
		return dependente2;
	}

	public void setDependente2(Dependente dependente2) {
		this.dependente2 = dependente2;
	}
	
	public Dependente getDependente3() {
		return dependente3;
	}

	public void setDependente3(Dependente dependente3) {
		this.dependente3 = dependente3;
	}

	public Integer getId() {
		return id;
	}
	
}