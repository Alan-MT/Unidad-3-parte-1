import java.util.Scanner;

public class Ejercicio12_20 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double c;
		double f;
		System.out.println("Ingrese la temperatura a transformar");
		c = scanner.nextDouble();
		f = (c*9/5)+32;
		System.out.println("La temperatura es de "+f+" Farehhit");
	}


}

