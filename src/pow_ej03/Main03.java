package pow_ej03;

import java.util.Scanner;

public class Main03 {
	
	public static double pow(double x, int exp) {
		if(exp == 0) return 1;
		double pow = 1;
		for(int i = 0; i < exp; i++) pow *= x;
		return pow;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Número: ");
		double x = entrada.nextDouble();
		
		System.out.print("Exp: ");
		int exp = entrada.nextInt();

		System.out.println("Pow: " + pow(x, exp));

		entrada.close();
	}

}
