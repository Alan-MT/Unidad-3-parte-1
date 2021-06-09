import java.util.Scanner;

public class Ejercicio10_20 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double altura;
		double area;
		double base;
		double perimetro;
		System.out.println("ingrese la base del rectangulo");
		base = scanner.nextDouble();
		System.out.println("Ingresa la altura del rectangulo");
		altura = scanner.nextDouble();
		perimetro = 2*base+2*altura;
		area = base*altura;
		System.out.println("El Area es de  "+area);
		System.out.println("El perimetro es de "+perimetro);
	}


}

