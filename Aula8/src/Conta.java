
public class Conta implements Comparable<Conta>{
	private double saldo;
	private String cpf;
	public Conta (String cpf, double saldo) {
		setSaldo(saldo);
		setCpf(cpf);
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String toString() {
		return "cpf: " + cpf + " saldo: " + saldo;
	}
	@Override
	public int compareTo(Conta o) {
		return cpf.compareTo(o.cpf);
	}
}
