import java.util.Scanner;

public class Ejercicio14_20 {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		double num1;
		double num2;
		num1 = sca.nextDouble();
		num2 = sca.nextDouble();
		if (num1%num2==0) {
			System.out.println(num1+" Es divisible entre "+num2);
		} else {
			System.out.println(num1+" No es divisible entre "+num2);
		}
	}


}

