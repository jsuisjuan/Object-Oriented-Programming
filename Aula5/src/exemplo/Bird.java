package exemplo;

public class Bird extends Animal implements Flyer{
	public void takeOff() {
		System.out.println("levantando voo");
	}
	public void land() {
		System.out.println("pousando");
	}
	public void fly() {
		System.out.println("voando");
	}
	
	public void buildNest() {
		System.out.println("construind ninho");
	}
}
