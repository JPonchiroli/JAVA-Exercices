package projetoSCI;

import java.util.Scanner;

public class Exe_04_JAVA {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int numeros[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe os Valores");
			numeros[i] = s.nextInt();
		}
		System.out.println("Terceira Posicao: " + numeros[2]);
		
		s.close();

	}

}
