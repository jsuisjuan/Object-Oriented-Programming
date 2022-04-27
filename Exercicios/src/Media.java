
public class Media {
	public static void main(String [] args) {
		Aluno x = new Aluno();
		x.setNome("Juan Carvalho Silva de Lima");
		x.setNota1(5);
		x.setNota2(4);
		
		if (x.getNota1() < 0) {
			x.setNota1(0);
		}
		if (x.getNota1() > 10) {
			x.setNota1(10);
		}
		
		if (x.getNota2() < 0) {
			x.setNota2(0);
		}
		if (x.getNota2() > 10) {
			x.setNota2(10);
		}
		
		double media = (x.getNota1() + x.getNota2()) / 2;
		System.out.println('\t' + "Escola XYZ: Sistema de Notas");
		System.out.println("");
		System.out.println("Nome: " + x.getNome());
		System.out.println("Nota 1: " + x.getNota1() + '\t' + "Nota 2: " + x.getNota2());
		System.out.print("Média Final: " + media + "  Resultado: ");
		
		if (media >= 6) {
			System.out.println("Aprovado.");
		} else if (media >= 4) {
			System.out.println("Em Recuperação.");
		} else {
			System.out.println("Reprovado.");
		}
		
	}
}
