package ej01;

import java.util.Scanner;

public class Main01 {
	
 	public static void cambiarVariables(String var1, String var2) {
 		String temp = var1;
		var1 = var2;
		var2 = temp;
		
		System.out.println("Variable 1: " + var1);
		System.out.println("Variable 2: " + var2);
 	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Variable 1: ");
		String var1 = entrada.nextLine();
		
		System.out.print("Variable 2: ");
		String var2 = entrada.nextLine();
		
		cambiarVariables(var1, var2);
		
		entrada.close();
	}

}
