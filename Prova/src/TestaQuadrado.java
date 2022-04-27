
public class TestaQuadrado extends Quadrado {
	public static void main(String[] args) {
		
		Quadrado a = new Quadrado();
		Quadrado b = new Quadrado();
		
		a.setAlt(2);
		a.setLarg(3);
		
		b.setAlt(2);
		b.setLarg(3);
		
		System.out.println(a.equals(b));
	}

}
