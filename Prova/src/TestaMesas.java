import java.util.Scanner;
import java.util.ArrayList;

public class TestaMesas {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		
		System.out.println('\t'+"Testa Mesas");
		
		while(true) {
			System.out.print("Insira um código para a mesa: ");
			String codigo = scanner.next();
			System.out.print("Insira um valor para a mesa: ");
			double valor = scanner.nextDouble();
			
			Mesa novaMesa = new Mesa();
			novaMesa.setCodigo(codigo);
			novaMesa.setValor(valor);
			
			mesas.add(novaMesa);
			
			System.out.print("Você deseja continuar? (S/N)");
			String continuar = scanner.next().toLowerCase();
            if(continuar.equals("n")){
                break;
            }
		}
		System.out.println('\t'+ "Tabela de Mesas");
		mesas.forEach(novaMesa -> System.out.println(novaMesa.getCodigo() + "  " + novaMesa.getValor()));
		
		double media = calculaMediaPrecoMesas(mesas); 
		System.out.println("A média dos preços é: " + media);
	}
	
	public static double calculaMediaPrecoMesas(ArrayList<Mesa> listaDeMesas) {
		double soma = 0.0;
		for (int i = 0; i < listaDeMesas.size(); i++) {
			soma += ((Mesa) listaDeMesas.get(i)).getValor();
		}
		return soma/listaDeMesas.size();
	}
}
