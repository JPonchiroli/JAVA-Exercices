package projetoSCI;

import java.util.Scanner;

public class Exe_02_JAVA {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int numeros[] = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe os Valores");
			numeros[i] = s.nextInt();
		}

		int maiorNum = numeros[0];
		int menorNum = numeros[0];

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maiorNum) {
				maiorNum = numeros[i];
			}
			if (numeros[i] < menorNum) {
				menorNum = numeros[i];
			}
		}
		
		System.out.println("\n");

		System.out.println("Maior Numero: " + maiorNum);
		System.out.println("Menor Numero: " + menorNum);
		
		s.close();
	}

}
