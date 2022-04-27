
public class TestaCasa {
	public static void main (String [] args) {
		System.out.println("Iniciando...");
		
		Casa c1 = new Casa();
		c1.numero = 185;
		c1.cor = "amarela";
		
		Casa c2 = new Casa();
		c2.numero = 166;
		c2.cor = "verde";
		
		System.out.println("A casa de número " + c1.numero + " tem cor " + c1.cor + ".");
		System.out.println("A casa de número " + c2.numero + " tem cor " + c2.cor + ".");
	}
}
