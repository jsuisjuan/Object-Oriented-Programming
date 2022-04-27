
public class ExemploSobrecarga {
	public int soma(int x, int y) {
		return x + y;
	}
	public int soma(int x, int y, int z) {
		return x + y;
	}
	public double soma (double x, double y) {
		return x + y;
	}
	public long soma (int x, int y) {
		return x + y;
	}
	
	public static void main(String [] args) {
		ExemploSobrecarga es = new ExemploSobrecarga();
		System.out.println(es.soma(12, 20));
	}
}
