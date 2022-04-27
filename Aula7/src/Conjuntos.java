
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Conjuntos {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Arnaldo", "123");
		Pessoa p2 = new Pessoa("Suzana", "456");
		Pessoa p3 = new Pessoa("Arnaldo", "123");
		
		Set conjunto = new HashSet();
		conjunto.add(p1);
		conjunto.add(p2);
		conjunto.add(p3);
		p1.setIdade(15);
		p2.setIdade(19);
		p3.setIdade(40);
		System.out.println(conjunto);
		System.out.println(p1.equals(p3));
		
		System.out.println(calculaMediaIdade(conjunto));
	}
	public static Set getPessoasBD() {
		HashSet conjunto = new HashSet();
		return conjunto;
	}
	public static double calculaMediaIdade(Set conj) {//pode ser Collection conj tbm
		Iterator it = conj.iterator();
		int somaIdade = 0;
		while(it.hasNext()) {
			Object o = it.next();
			Pessoa p = (Pessoa)o;
			somaIdade += p.getIdade();
		}
		return (double)somaIdade/conj.size();
	}
}
