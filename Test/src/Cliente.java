
public class Cliente {
	private String cpf;
	private String nome;
	private String profissao;
	
	public Cliente() {
	}
	public Cliente(String cpf) {
		setCpf(cpf);
	}
	public Cliente(String nome, String cpf) {
		setNome(nome);
		setCpf(nome);
	}
	public Cliente(String nome, String cpf, String profissao) {
		setNome(nome);
		setCpf(nome);
		setProfissao(profissao);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String toString() {
		return "[nome: " + getNome() + "]---[cpf: " + getCpf() + "]";
	}
}
