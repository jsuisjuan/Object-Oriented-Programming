
public class ContaCorrente {
	private double saldo;
	public void sacar(double valor) throws SemSaldoCheckedException {
		if (this.saldo < valor) {
			throw new SemSaldoCheckedException("Tentando sacar: " + valor + " - saldo: " + saldo);
			//return false;
		} else {
			this.saldo -= valor;
			//return true;
		}
	}
	public void depositar(double valor) {
		saldo += valor;
	}
	public double getSaldo() {
		return saldo;
	}
}
