package exercicioAula6;

import java.util.ArrayList;
import java.util.List;

public class Utils {
	public static boolean existe (List x, Funcionario y) {
		return x.contains(y);
	}
	public static List retornaDados(String [] array_funcionarios) {
		ArrayList listaDados = new ArrayList();
		
		for (int i = 0; i < array_funcionarios.length; i++) {
			String func = array_funcionarios[i];
			//id#nome#salario#tipo
			String [] x = func.split("#");
			if (x[3].equalsIgnoreCase("A")) {
				AnalistadeSistemas analista = new AnalistadeSistemas(x[0]);
				analista.setNome(x[1]);
				analista.setSalario(Double.parseDouble(x[2]));
				listaDados.add(analista);
			} else if (x[3].equalsIgnoreCase("P")) {
				Programador programador = new Programador(x[0]);
				programador.setNome(x[1]);
				programador.setSalario(Double.parseDouble(x[2]));
				listaDados.add(programador);
			}
		}
		return listaDados;
	}
	public static void exibeMedia(List funcionarios) {
		double mediaAnalistas = 0;
		int contAnalistas = 0;
		double mediaProgramadores = 0;
		int contProgramadores = 0;
		
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i) instanceof AnalistadeSistemas) {
				mediaAnalistas += ((AnalistadeSistemas)funcionarios.get(i)).getSalario();
				contAnalistas++;
			} else if (funcionarios.get(i) instanceof Programador) {
				mediaProgramadores += ((Programador)funcionarios.get(i)).getSalario();
				contProgramadores++;
			}
		} 
		mediaAnalistas = mediaAnalistas / contAnalistas;
		mediaProgramadores = mediaProgramadores/contProgramadores;
		System.out.println("Media dos analistas: " + mediaAnalistas);
		System.out.println("Media dos programadores: " + mediaProgramadores);
	}
}
