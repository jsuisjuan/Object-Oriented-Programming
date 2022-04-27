
public class TesteBanco {
	
	public static void main(String[] args) {
		Cliente c3 = new ClientePF("12312312312", "Arthur");
		Conta c = new Conta(444, c3);
		
		System.out.println(c.getNumero());
		System.out.println(c.getSaldo());
		System.out.println(c.getTitular());
		System.out.println(c.getTitular().getCpf());
		System.out.println(c.getTitular().getNome());
	}
}
