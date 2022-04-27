
public class HerancaArraysDois {
	public static void main(String [] args) {
		Animal [] corrida = {new Gato(), new Cobra(), new Cobra(), new Gato(), new Gato()};
		corrida[0].setNome("Felix");
		corrida[1].setNome("C1");
		corrida[2].setNome("C2");
		corrida[3].setNome("Tom");
		corrida[4].setNome("Mingau");
		for (int i = 0; i < corrida.length; i++) {
			Animal a = corrida[i];
			System.out.println(a);
			a.emitirSom();
		}	
	}
}
