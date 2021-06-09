import java.util.Scanner;

public class Ejercicio8_20 {

	public static void main(String args[])  {
		Scanner scanner =new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		double promedio;
		System.out.println("Ingrese lo tres numeros");
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		num3 = scanner.nextDouble();
		promedio = (num1+num2+num3)/3;
		System.out.println("El promedio es de "+promedio);
	}


}

