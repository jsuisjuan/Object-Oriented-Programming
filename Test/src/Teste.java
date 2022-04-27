
public class Teste {
	public static void main (String [] args) {
		System.out.println("Iniciando...");
		
		Cachorro c1 = new Cachorro();
		c1.idade = 15;
		c1.nome = "Jade";
		
		Cachorro c2 = new Cachorro();
		c2.nome = "Spoote";
		
		System.out.println("O nome do primeiro cachorro: " + c1.nome);
		System.out.println("O nome do segundo cachorro: " + c2.nome);
		
		c1.latir();
		c2.latir();
	}
}
