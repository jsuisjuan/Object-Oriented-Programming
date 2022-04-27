package exercicioAula6;

import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
	private static final int QTD_FUNCIONARIOS = 1;
	public static void main(String[] args) {
		Scanner scString = new Scanner(System.in);
		Scanner scDouble = new Scanner(System.in);
		
		String [] array_funcionarios = new String [QTD_FUNCIONARIOS];
		for (int i = 0; i < QTD_FUNCIONARIOS; i++) {
			System.out.println("Insira o funcionário no seguinte formato: id#nome#salario#tipo");
			String linha = scString.nextLine();
			array_funcionarios[i] = linha;
		}
		List listaFuncionarios = Utils.retornaDados(array_funcionarios);
		for (int i = 0; i < listaFuncionarios.size(); i++) {
			System.out.println(listaFuncionarios.get(i));
		}
		System.out.println("---------------------------");
		Utils.exibeMedia(listaFuncionarios);
		
		System.out.println("----------------------------");
		System.out.println("----------------------------");
		for (int i = 0; i < 2; i++) {
			System.out.println("Insira o id para saber quanto o funcionário recebe");
			String idVerificar = scString.nextLine();
			Funcionario f = new Funcionario(idVerificar);
			boolean b = Utils.existe(listaFuncionarios, f);
			if (b) {
				listaFuncionarios.get(listaFuncionarios.indexOf(f));
			} else {
				System.out.println("Não existe o funcionário com o id = " + idVerificar + " no sistema");
			}
		}
		
	}

}
