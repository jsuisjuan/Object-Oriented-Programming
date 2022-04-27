import java.util.Scanner;

public class Teste {
	public static void main(String [] args) {
		
		System.out.println('\t' + "Bem vindo ao Banco XYZ");
		System.out.println("Criar conta bancaria:");
		System.out.println("Insira o dia de abertura da conta: ");
		Scanner scanner = new Scanner(System.in);
		int diaAbertura = scanner.nextInt();
		System.out.println("Insira o mês de abertura da conta: ");
		int mesAbertura = scanner.nextInt();
		System.out.println("Insira o ano de abertura da conta: ");
		int anoAbertura = scanner.nextInt();
		
		Data x = new Data();
		x.setDia(diaAbertura);
		x.setAno(mesAbertura);
		x.setAno(anoAbertura);
		
		ContaBancaria y = new ContaBancaria();
		y.setDataAbertura(x);
		String dataAbertura = y.getDataAberturaFormatada(x);
		
		
		System.out.println("Agora, insira o seu saldo:");
		double saldo = scanner.nextDouble();
		
		y.setSaldo(saldo);
		String saldoAtual = y.getSaldoFormatado(y.getSaldo());
		
		System.out.println("Parabéns! Sua conta bancaria foi criada com sucesso!");
		System.out.println("Data de abertura: " + dataAbertura);
		System.out.println("Saldo Atual: " + saldoAtual);
		
		System.out.println("Você deseja depositar(S/N)?");
		String depositarAcao = scanner.nextLine();
		
		if (depositarAcao == "S") {
			System.out.println("Quanto você deseja depositar?");
			double valorDepositar = scanner.nextDouble();
			y.depositar(valorDepositar);
		} else {
			System.out.println("Você deseja sacar(S/N)?");
			String sacarAcao = scanner.nextLine();
			if (sacarAcao == "S") {
				System.out.println("Quanto você deseja sacar?");
				double valorSacar = scanner.nextDouble();
				y.sacar(valorSacar);
			}
		}
		
		
		System.out.println("Obrigado pela Escolha! Tenha um ótimo dia!");
		scanner.close();
	}
}
