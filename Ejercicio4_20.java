import java.util.*;

public class Ejercicio4_20 {

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int doble;
		int num;
		int triple;
		num = scanner.nextInt();
		doble = (int)(Math.pow(num,2));
		triple = (int)(Math.pow(num,3));
		System.out.println("El doble del numero ingresado es "+doble);
		System.out.println("El triple del numero ingresado es "+triple);
	}


}

