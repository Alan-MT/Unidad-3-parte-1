import java.util.Scanner;

public class Ejercicio16_20 {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		System.out.println("ingrese 3 numero");
		num1 = sca.nextInt();
		num2 = sca.nextInt();
		num3 = sca.nextInt();
		if (num1>num2 && num1>num3) {
			System.out.println("El numero mayor es "+num1);
		} else {
			if (num2>num3) {
				System.out.println("el numero mayor es "+num2);
			} else {
				System.out.println("El numero mayor es "+num3);
			}
		}
	}


}

