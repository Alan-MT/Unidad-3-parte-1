import java.util.Scanner;

public class Ejercicio9_20 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String a;
		String b;
		String c;
		System.out.println("Ingrese la primera palabra");
		a = scanner.next();
		System.out.println("Ingresa la segunda palabra");
		b = scanner.next();
		c = b;
		b = a;
		a = c;
		System.out.println("la primera palabra es "+a);
		System.out.println("La segunda palabra es "+b);
	}


}

