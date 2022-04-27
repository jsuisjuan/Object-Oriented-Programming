
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gener {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("dormir");
		lista.add("estudar");
		lista.add("comer");
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}

	}

}
