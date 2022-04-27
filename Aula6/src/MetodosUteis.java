import java.util.ArrayList;

public class MetodosUteis {
	public static void main(String[] args) {
		/*
		String.toCharArray(): char []
		String.split(String): String []
		String.toLowerCase(): String
		String.toUpperCase(): String
		String.trim(): String
		Integer.parseInt(String)
		Double.parseDouble(String)
		 */
		
		String str = "A casa é bonita";
		String str2 = "A casa é bonita      ";
		char [] array_char = str.toCharArray();
		for (int i = 0; i < array_char.length; i++) {
			System.out.println(array_char[i]);
		}
		System.out.println("Tamanho do array: " + array_char.length);
		
		String [] array_str = str.split(" ");
		for (int i = 0; i < array_str.length; i++) {
			System.out.println(array_str[i]);
		}
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		str2 = str2.trim();
		System.out.println("#"+ str +"#");
		System.out.println("#"+ str2 + "#");
		
		String num1 = "14";
		String num2 = "14.4";
		
		int n1 = Integer.parseInt(num1);
		System.out.println(n1);
		
		double n2 = Double.parseDouble(num2);
		System.out.println(n2);
		
		ArrayList x = new ArrayList();
		x.add("Antonio#15");
		x.add("Luana#17");
		x.add("Marcelo#16");
		
		int soma=0;
		for (int i = 0; i < x.size(); i++) {
			String linha = (String) x.get(i);
			String [] nome_idade = linha.split("#");
			int idade = Integer.parseInt(nome_idade[1]);
			soma += idade;
		}
		System.out.println((double)soma/x.size());
	}
	
}
