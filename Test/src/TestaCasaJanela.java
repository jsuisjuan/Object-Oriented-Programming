
public class TestaCasaJanela {
	public static void main (String [] args) {
		System.out.println("Iniciando...");
		
		Janela j2 = new Janela();
		j2.cor = "natural";
		j2.material = "madeira";
		
		Casa c1 = new Casa();
		c1.numero = 185;
		c1.cor = "branca";
		c1.j1.cor = "natural";
		c1.j1.material = "eucalipto";
		
		System.out.println("Esta é a casa de número " + c1.numero + ". Ela ter a cor " + c1.cor + ", e janelas de " + c1.j1.material + ", de cor " + c1.j1.cor + ".");
		
		/*int i = 5;
		int x = ++i;
		System.out.print(x);
		*/
	}
}
