package studio7;

public class Complex_number {

	public static int x =0;
	public static int y = 0;
	public Complex_number(int a, int b) {
		// TODO Auto-generated method stub
		x = a;
		y = b;
	}

	public static int real(Complex_number B) {
		return x;
	}
	public static int comp(Complex_number B) {
		return y;
	}
	public static String add(Complex_number B) {
		x = x + real(B);
		y = y + comp(B);
		return (x+"+"+y+"i");
	}
}
