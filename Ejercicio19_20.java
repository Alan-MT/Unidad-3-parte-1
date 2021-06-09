public class Ejercicio19_20 {

	public static void main(String args[]) {
		int n;
		n = (int)(Math.random()*1000);
		System.out.println("el numero generado es "+n);
		if (n%5==0 && n<=25) {
			System.out.println("CORRECTO");
		} else {
			System.out.println("INCORRECTO");
		}
	}


}

