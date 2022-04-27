
public class Animal {
	private String nome;
	private String cor;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void emitirSom() {
		System.out.println("som genérico");
	}
	public String toString() {
		return getNome();
	}
}
