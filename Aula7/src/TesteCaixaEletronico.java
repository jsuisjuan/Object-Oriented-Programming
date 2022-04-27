
public class TesteCaixaEletronico {

	public static void main(String[] args) {
		
		ContaCorrente c = new ContaCorrente();
		int valorDeSaque = 100;
		c.depositar(100);
		try {
			c.sacar(valorDeSaque);
			System.out.println("Liberando dinheiro: " + valorDeSaque);
		} catch (SemSaldoCheckedException e) {
			System.out.println(e);
		}
		
		
		System.out.println("Saldo final: " + c.getSaldo());
		System.out.println("Fim...");
	}

}
