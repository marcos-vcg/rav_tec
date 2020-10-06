package classes;

public enum Grau {

	PAI("Pai");
	
	private String descricao;
	
	Grau(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() { return descricao; }
	
}
