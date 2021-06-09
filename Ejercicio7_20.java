public class Ejercicio7_20 {

	public static void main(String args[]) {
		double disminuido;
		double nu;
		int num;
		num = (int)(Math.random()*(50-10+1)+10);
		System.out.println("El numero aleatorio es "+num);
		disminuido = (num*15)/100;
		nu = num-disminuido;
		System.out.println("El numero disminuido es "+nu);
	}


}

