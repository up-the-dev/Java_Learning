package concept.examples.oops.interfaces;

public class Aeroplane implements Flyable {
	@Override
	public void fly() {
		System.out.println("Aeroplane is flying");
	}
}