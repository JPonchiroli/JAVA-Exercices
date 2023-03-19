package projetoSCI;

import java.util.Scanner;

public class Exe_01_JAVA {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int numeros[] = new int[5];
		float mediaNumeros = 0.0f;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe os Valores");
			numeros[i] = s.nextInt();
			mediaNumeros += numeros[i];
		}

		System.out.println("\n");

		for (int i = 0; i < 5; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println("Par: " + numeros[i]);
			} else {
				System.out.println("Impar: " + numeros[i]);
			}

		}

		System.out.println("Media dos Numeros: " + mediaNumeros / 5);
		
		s.close();
	}

}
