import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class QuestaoDois {
	public static void main(String[] args) {
		List<String> letras = new ArrayList<String>();
		letras.add("W");
		letras.add("X");
		letras.add("G");
		letras.add("B");
		letras.add("A");
		
		Arrays.sort(letras);
		System.out.println(letras);
	}
}
