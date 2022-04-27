import java.util.Map;

public class ABC {
	public static double calculaMedia(Map<String, Double> g, int cargo) {
		int i = 0;
		double soma = 0;
		var entrySet = g.entrySet();
		
		for (var entry : entrySet) {
			String codigo = entry.getKey();
			String [] x = codigo.split("#");
			if (x[1].equalsIgnoreCase("1")) {
				soma += entry.getValue();
				i++;
			}
		}
		
		double media = soma / i; 
		return media; 	
	}
}
