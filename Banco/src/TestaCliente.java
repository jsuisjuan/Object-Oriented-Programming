
public class TestaCliente {
	public static void main (String [] args) {
		Cliente x = new Cliente();
		x.setCPF("08493");
		x.setIdade(15);
		x.setEndereco("Rua das Nuvens 12");
		System.out.println(x.getCPF() + " - " + x.getIdade() + " - " + x.getEndereco());
	}
}
