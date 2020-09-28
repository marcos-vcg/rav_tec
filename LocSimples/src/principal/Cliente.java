package principal;

public class Cliente {


	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String nascimento;
	private String endereco;
	/* private Object foto; */


	
	// Construtor com os campos obrigatórios
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
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

	/*
	 * public Object getFoto() { return foto; }
	 * 
	 * public void setFoto(Object foto) { this.foto = foto; }
	 */

	// Retorna os dados
	public String getDados() {
		return "Nome: " + this.nome + " CPF: " + this.cpf;
	}
	
	public static Cliente addCliente(String nome, String cpf) {
		Cliente cliente = new Cliente(nome, cpf);
		return cliente;
	}
}
