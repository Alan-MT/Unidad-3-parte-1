import java.util.Scanner;

public class Ejercicio15_20 {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		double num;
		num = sca.nextDouble();
		if (num==0) {
			System.out.println("el numero es nulo");
		} else {
			if (num>0) {
				System.out.println("El numero es positivo");
			} else {
				System.out.println("El numero es negativo");
			}
		}
	}


}

