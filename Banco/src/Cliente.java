
public class Cliente {
	private String CPF;
	private int idade;
	private String endereco;
	
	public Cliente() {
		System.out.println("Criando um novo cliente....");
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int i) {
		idade = i;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String end) {
		endereco = end;
	}
}
