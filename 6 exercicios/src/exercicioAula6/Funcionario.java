package exercicioAula6;

public class Funcionario {
	private String id;
	private String nome;
	private double salario;
	
	public Funcionario(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj instanceof Funcionario) {
			Funcionario x = (Funcionario) obj;
			if (id != null) {
				return id.equals(x.id);
			}
		}
		return false;
	}
	
	public String toString() {
		return id + " - " + nome + " - " + salario;
	}
}
