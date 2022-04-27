
public class TesteIgualdade {
	
	public static void main(String[] args) {
		String str = "casa";
		String str2 = "casa ".trim();
		String str3 = "casa";
		
		System.out.println("[" + str + "]");
		System.out.println("[" + str2 + "]");
		System.out.println(str == str2);
		
		System.out.println(str.equals(str2));
		
		Pessoa p1 = new Pessoa();
		p1.setCpf("1234567");
		Pessoa p2 = new Pessoa();
		p2.setCpf("1234567");
		Pessoa p3 = p1;
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		System.out.println(p1.equals(p2));
	}
	
}
