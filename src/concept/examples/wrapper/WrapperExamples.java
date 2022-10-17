package concept.examples.wrapper;

public class WrapperExamples {

	public static void main(String[] args) {
		// Boolean,Byte,Character,Double,Float,Integer,Long,Short
		// boolean,byte,char ,double,float,int ,long,short

		// Wrapper classes are final

		int number = 55;// int

		int value = 10;
		value = value + 1;

		int number2 = Integer.parseInt("55");// String

		Float number3 = new Float(55.0);// double argument
		float number4 = 55.0f;// float argument
		float number5 = Float.parseFloat("55.0f");// String

		char c1 = 'C';// Only char constructor
		// Character c2 = new Character(124);//COMPILER ERROR

		boolean b = true;

		// "true" "True" "tRUe" - all String Values give True
		// Anything else gives false
		boolean b1 = Boolean.parseBoolean("true");// value stored - true
		boolean b2 = Boolean.parseBoolean("True");// value stored - true
		boolean b3 = Boolean.parseBoolean("False");// value stored - false
		boolean b4 = Boolean.parseBoolean("SomeString");// value stored - false

		b = false;

		// Wrapper Objects are immutable (like String)

		int i = 5;
		i = 6;
		i = 7;

		//Immutability
		//Wrapper Classes and String
		int integer = 6;
		integer = 7;

		//#########
		//#   6   #
		//#########

		//#########
		//#   7   #
		//#########

		// valueOfMethods
		// Provide another way of creating a Wrapper Object
		Integer seven = Integer.valueOf("111", 2);// binary 111 is converted to
													// 7

		int hundred = Integer.parseInt("100", 10);// 100 is stored in
														// variable

		// xxxValue methods help in creating primitives
		//Integer integer = Integer.valueOf(57);
		int primitive = seven.intValue();// 57
		float primitiveFloat = seven.floatValue();// 57.0f

		Float floatWrapper = Float.valueOf(57.0f);
		int floatToInt = floatWrapper.intValue();// 57
		float floatToFloat = floatWrapper.floatValue();// 57.0f

		// parseXxx methods are similar to valueOf but they
		// return primitive values
		int sevenPrimitive = Integer.parseInt("111", 2);// binary 111 is
														// converted to 7

		int hundredPrimitive = Integer.parseInt("100");// 100 is stored in
														// variable

		//Creates new Integer object
		Integer wrapperEight = new Integer(8);

		// Normal static toString method
		System.out.println(Integer.toString(wrapperEight));// String Output : 8

		// Overloaded static toString method : 2nd parameter : radix
		System.out.println(Integer.toString(wrapperEight, 2));// String Output :
																// 1000

		// static toXxxString methods. Xxx can be Hex,Binary,Octal
		System.out.println(Integer.toHexString(wrapperEight));// String Output
																// :8
		System.out.println(Integer.toBinaryString(wrapperEight));// String
																	// Output
																	// :1000
		System.out.println(Integer.toOctalString(wrapperEight));// String Output
																// :10

		// Auto Boxing
		int ten = 10;
		ten++;// allowed. Java does had work behing the screen for us

		// Two wrapper objects created using new are not same object
		Integer nineA = new Integer(9);
		Integer nineB = new Integer(9);
		System.out.println(nineA == nineB);// false
		System.out.println(nineA.equals(nineB));// true

		// Two wrapper objects created using boxing are same object
		Integer nineC = 9;
		Integer nineD = 9;
		System.out.println(nineC == nineD);// true
		System.out.println(nineC.equals(nineD));// true
	}
}
