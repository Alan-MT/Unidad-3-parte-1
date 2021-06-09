import java.util.Scanner;

public class Ejercicio18_20 {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		int d1 = 0;
		int d2= 0;
		int d3= 0;
		int d4= 0;
		int num;
		int suma;
		num = sca.nextInt();
		if (num<10) {
			d4 = Integer.parseInt(String.valueOf(Double.toString(num).substring(0,1)));
		} else {
			if (num<100) {
				d3 = Integer.parseInt(String.valueOf(Double.toString(num).substring(0,1)));
				d4 = Integer.parseInt(String.valueOf(Double.toString(num).substring(1,2)));
			} else {
				if (num<1000) {
					d2 = Integer.parseInt(String.valueOf(Double.toString(num).substring(0,1)));
					d3 = Integer.parseInt(String.valueOf(Double.toString(num).substring(1,2)));
					d4 = Integer.parseInt(String.valueOf(Double.toString(num).substring(2,3)));
				} else {
					if (num<10000) {
						d1 = Integer.parseInt(String.valueOf(Double.toString(num).substring(0,1)));
						d2 = Integer.parseInt(String.valueOf(Double.toString(num).substring(1,2)));
						d3 = Integer.parseInt(String.valueOf(Double.toString(num).substring(2,3)));
						d4 = Integer.parseInt(String.valueOf(Double.toString(num).substring(3,4)));
					} else {
						System.out.println("Debe ingresar un n�mero menor o igual a 4 digitos");
					}
				}
			}
		}
		suma = d1+d2+d3+d4;
		System.out.println("d1="+d1+" d2="+d2+" d3="+d3+" d4="+d4);
		System.out.println("Suma:"+suma);
	}


}

