package exemplo;

public class Airplane extends Vehicle implements Flyer {
	public void takeOff() {
		System.out.println("levantando voo");
	}
	public void land() {
		System.out.println("pousando");
	}
	public void fly() {
		System.out.println("voando");
	}
}
