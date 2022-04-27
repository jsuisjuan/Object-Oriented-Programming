
public class GatoTeste {
	public static void main (String [] args) {
		System.out.println("Iniciando...");
		
		Gato g1 = new Gato();
		g1.vivo = true;
		g1.cor = "preto";
		g1.idade = 4;
		g1.nome = "Jonny";
		
		Gato g2 = new Gato();
		g2.vivo = false;
		g2.cor = "laranja";
		g2.idade = 15;
		g2.nome = "Sra.Cristal";
		
		Gato g3 = new Gato();
		g3.vivo = true;
		g3.cor = "branco e cinza";
		g3.idade = 7;
		g3.nome = "Aldebaran";
		
		
		System.out.println("Este é " + g1.nome + ". Ele é " + g1.cor + " e tem " + g1.idade + ", por isso está " + g1.vivo + ".");
		System.out.println("Esta é " + g2.nome + ". Ela é " + g2.cor + " e tem " + g2.idade + ", por isso está " + g2.vivo + ".");
		System.out.println("Este é " + g3.nome + ". Ele é " + g3.cor + " e tem " + g3.idade + ", por isso está " + g3.vivo + ".");
	}
}
