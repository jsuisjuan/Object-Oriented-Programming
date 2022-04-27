import java.util.Arrays;
import java.util.List;
import static java.util.Comparator.comparing;

public class Cachorro {
	private String nome;
	private int idade;
	private double peso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public Cachorro() {
	}
	public Cachorro(String nome, int idade, double peso) {
		setNome(nome);
		setIdade(idade);
		setPeso(peso);
	}
	
	listaCachorros.sort(Comparator.comparing(Cachorro::getIdade));
	 
	public String toString() {
		return nome + " - " + idade + " - " + peso + "kg";
	}
}
