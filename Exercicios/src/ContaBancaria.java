
public class ContaBancaria {
	private double saldo = 0.0;
	private Data dataAbertura = new Data();
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Data getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public String getDataAberturaFormatada(Data dataAbertura) {
		String dataAberturaFormatada = dataAbertura.getDia() + "/" + dataAbertura.getMes() + "/" + dataAbertura.getAno(); 
		return dataAberturaFormatada;
	}
	public String getSaldoFormatado(double saldo) {
		String saldoFormatado = "R$ " + getSaldo();
		return saldoFormatado;
	}
	
	public void depositar(double novoSaldo) {
		setSaldo(getSaldo() + novoSaldo);
		System.out.println("Você depositou: " + novoSaldo);
		System.out.println("Saldo Atual: " + getSaldo());
	}
	public void sacar(double saldoSacar) {
		if (saldoSacar > getSaldo()) {
			System.out.println("O valor de saque é maior do que o valor depositado!");
		} else {
			System.out.println("R$ " + saldoSacar + " foram saqueados!");
		}
	}
	
}
