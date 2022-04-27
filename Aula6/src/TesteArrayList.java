import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {
		/*
		List.get(int):Object
		List.add(Object): boolean
		List.indexOf(Object): int
		List.contains(Object): boolean
		List.remove(int): Object
		List.remove(Object): boolean
		List.removeAll(Collection): boolean
		 */
		//Scanner
		//Qual o cpf da pessoa que você quer consultar?
		String cpf_a_consultar = "15543454";
		
		Pessoa pessoa_a_consultar = new Pessoa(cpf_a_consultar);
		
		int indice = -1;
		List lista = getPessoas();
		List lista2 = getPessoas();
		System.out.println(lista);
		indice = lista.indexOf(pessoa_a_consultar);
		System.out.println("O índice do objeto é: " + indice);
		System.out.println(lista.contains(pessoa_a_consultar));
		System.out.println("Removido: " + lista.remove(pessoa_a_consultar));
		System.out.println(lista);
		System.out.println(lista2);
		lista2.removeAll(lista);
		System.out.println("--------------------");
		System.out.println(lista);
		System.out.println(lista2);
	}
	public static List getPessoas() {
		ArrayList retorno = new ArrayList();
		List banco = getPessoasDoBancoDeDados();
		for (int i = 0; i < banco.size(); i++) {
			String pessoastr = (String) banco.get(i);
			String [] array_pessoa = pessoastr.split("#");
			Pessoa p = new Pessoa(array_pessoa[0], array_pessoa[1]);
			retorno.add(p);
		}
		return retorno;
	}
	public static List getPessoasDoBancoDeDados() {
		ArrayList x = new ArrayList();
		x.add("Antonio#151231254");
		x.add("Luana#1751353445");
		x.add("Marcelo#15543454");
		
		return x;
	}
}

