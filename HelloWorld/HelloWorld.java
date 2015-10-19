import java.math.BigDecimal;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		// double doubleValue=135.5d;
		// Double doubleObj=new Double(doubleValue);

		// byte myByteValue=doubleObj.byteValue();
		// int myIntValue=doubleObj.intValue();
		// float myFloatValue=doubleObj.floatValue();
		// String myString=doubleObj.toString();

		BigDecimal payment = new BigDecimal(1115.37);
		System.out.println(payment.toString());
		double d = 1115.737;
		String ds = Double.toString(d);
		BigDecimal bd = new BigDecimal(ds);
		System.out.println("The value is " + bd.toString());

		char c1 = '1';
		char c2 = 'k';
		System.out.println(Character.toUpperCase(c2));
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("the value of b1 is -> " + b1);
		// How to work around the boolean thing

		int i = 1;
		boolean b4 = (i != 0);
		System.out.println("the value of b4 is " + b4);
		String s = "true";
		boolean b5 = Boolean.parseBoolean(s);
		System.out.println(b5);

		float f = 123456.123456f;
		System.out.println(s + f);
		Date myDate = new Date();
		System.out.println("The new date is " + myDate);

	}
}