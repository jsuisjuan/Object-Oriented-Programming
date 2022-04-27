
public class Conta {
	private int numero;
	private Cliente titular;
	private double saldo;
	private double limite;
	
	public Conta(Cliente titular) {
		this.titular = titular;
	}
	public Conta(int numero, Cliente titular) {
		setNumero(numero);
		this.titular = titular;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public Cliente getTitular() {
		return titular;
	}
}
