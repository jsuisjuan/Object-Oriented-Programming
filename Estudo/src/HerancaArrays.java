
public class HerancaArrays {
	public static void main(String [] args) {
		Animal [] corrida = {new Gato(), new Cobra(), new Gato(), new Cobra(), new Gato(), new Gato()};
		for (int i = 0; i < corrida.length; i++) {
			corrida[i].emitirSom();
		}
	}
}
