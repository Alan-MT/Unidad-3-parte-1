import java.util.Scanner;

public class Ejercicio13_20 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double a;
		double r;
		double v;
		System.out.println("Ingrese el radio");
		r = scanner.nextDouble();
		if (r>0) {
			System.out.println("Ingrese la altura");
			a = scanner.nextDouble();
			if (a>0) {
				v = Math.PI*a*(Math.pow(r,2));
				System.out.println("El volumen del cilindro es de "+v);
			} else {
				System.out.println("La altura no puede ser negativa");
			}
		} else {
			System.out.println("El radio no puede ser negativo");
		}
	}


}

