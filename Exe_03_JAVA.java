package projetoSCI;

import java.util.Scanner;


public class Exe_03_JAVA {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int notas[] = new int[4];
		int media = 0;
		String nome;
		
		System.out.println("Informe o nome do Aluno");
		nome = s.next();
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Informe as Notas");
			notas[i] = s.nextInt();
			media += notas[i];
		}
		
		System.out.println("\n");
		
		System.out.println("Nome Aluno: "+nome);
		System.out.println("Media Aluno: "+media/4);
		if(media > 6) {
			System.out.println("Situação: Aprovado");
		}else {
			System.out.println("Situação: Reprovado");
		}
		
		s.close();

	}

}
