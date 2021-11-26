package abs_ej02;

import java.util.Scanner;

public class Main02 {
	
	public static double abs(double x) {
		return x < 0 ? -x : x;
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Número: ");
		double x = entrada.nextDouble();
		
		System.out.println("Número absoluto: " + abs(x));
		
		entrada.close();
		
	}

}
