package concept.examples.others;

public class SameType {
}

class SuperClass {

}

class SubClass extends SuperClass {

}

abstract class Abstract {
	abstract SuperClass method1();
}

interface Interface {
	SuperClass method2();
}

class ConcreteClass extends Abstract implements Interface {

	@Override
	public SubClass method2() {
		return null;
	}

	@Override
	SubClass method1() {
		return null;
	}

}
