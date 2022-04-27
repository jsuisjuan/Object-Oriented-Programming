import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		int [] vet = new int [3];
		
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Insira um valor inteiro:");
			int val = s.nextInt();
			//System.out.println("Valor inserido: " + val);
			vet[i] = val;
		}
		
		System.out.println("----Valores inseridos----");
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		System.out.println("Média:" + calcularMedia(vet));
		System.out.println("Fim do programa!");
	}
	
	public static double calcularMedia(int [] y) {
		double media = 0;
		for (int i = 0; i < y.length; i++) {
			media += y[i];
		}
		return media/y.length;
	}

}
