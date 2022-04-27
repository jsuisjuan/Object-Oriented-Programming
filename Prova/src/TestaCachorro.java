
public class TestaCachorro {

	public static void main(String[] args) {
		List listaCachorros = Dados.getDados();
		3-   Collections.sort(listaCachorros);
		4-   for (int i=0; i<listaCachorros.size(); i++) {
		5-      System.out.println(listaCachorros.get(i));
		6-   }

	}

}
