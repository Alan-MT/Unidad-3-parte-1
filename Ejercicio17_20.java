import java.util.Scanner;

public class Ejercicio17_20 {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("Ingrese el primer lado");
		a = sca.nextInt();
		System.out.println("Ingrese el segundo lado");
		b = sca.nextInt();
		System.out.println("Ingrese el tercer lado");
		c = sca.nextInt();
		if (a==b && a==c) {
			System.out.println("El triangulo es Equilatero");
		} else {
			if (a!=b && a!=c && c!=b) {
				System.out.println("El triangulo es Escaleno");
			} else {
				System.out.println("El triangulo es Isoceles");
			}
		}
	}


}

