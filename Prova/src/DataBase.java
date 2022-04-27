import java.util.Map;
import java.util.HashMap;

public class DataBase {
	public static void main(String[] args) {
		Map<String, Double> m = new HashMap<String, Double>();
		m.put("1234#1", 1000.70);
		m.put("553742#3", 10000.50);
		m.put("12#2", 1300.10);
		m.put("4343#1", 1000.80);
		m.put("4355#1", 2000.80);
		double med = calculaMedia(m, 1);
		
		System.out.println(med);

	}
	
		public static double calculaMedia(Map<String, Double> g, int cargo) {
			double soma = 0;
			int i = 0;
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
