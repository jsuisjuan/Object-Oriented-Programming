import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class TesteMapas {

	public static void main(String[] args) {
		Map mapa = new HashMap();
		Pessoa p = new Pessoa("Arthur", "123-3");
		p.setIdade(30);
		mapa.put(p.getCpf(), p);
		
		Pessoa p2 = new Pessoa("Amanda", "444-3");
		p2.setIdade(32);
		mapa.put(p2.getCpf(), p2);
		
		System.out.println(mapa);
		
		teste(mapa, "444-3");
		System.out.println(calculaMediaIdadesKeys(mapa));
	}
	public static void teste (Map m, String cpf) {
		Pessoa f = (Pessoa) m.get(cpf);
		if (f != null) {
			System.out.println(f.getIdade());
		} else {
			System.out.println("Cpf não encontrado...");
		}
	}
	public static double calculaMediaIdades(Map m) {
		Collection c = m.values();
		Iterator it = c.iterator();
		int soma = 0;
		while (it.hasNext()) {
			Pessoa p = (Pessoa) it.next();
			soma += p.getIdade();
		}
		return (double)soma/c.size();
	}
	public static double calculaMediaIdadesKeys(Map m) {
		Set chaves = m.keySet();
		Iterator it = chaves.iterator();
		int soma = 0;
		while (it.hasNext()) {
			String chave = (String)it.next();
			Pessoa p = (Pessoa) m.get(chave);
			soma += p.getIdade();
		}
		return (double)soma/chaves.size();
	}
}
