import java.util.Scanner;

public class Ejercicio11_20 {

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		double metros;
		double num;
		double pies;
		double pulgadas;
		double yardas;
		System.out.println("ingrese el valor a transformar");
		num = scanner.nextDouble();
		yardas = num*0.0109361;
		metros = num/100;
		pies = num/30.48;
		pulgadas = num/2.54;
		System.out.println("Los valores tansformados son los siguientes");
		System.out.println("yardas: "+yardas);
		System.out.println("metros: "+metros);
		System.out.println("pies: "+pies);
		System.out.println("pulgadas: "+pulgadas);
	}


}

