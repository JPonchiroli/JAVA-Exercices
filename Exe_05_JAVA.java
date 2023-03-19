package projetoSCI;

import java.util.Scanner;

public class Exe_05_JAVA {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		double[][] notas = new double[3][4];
        String[] nomes = new String[3];
        
        for (int n = 0; n < 3; n++) {
            System.out.print("Informe o nome do " + (n + 1) + "° Aluno: ");
            nomes[n] = s.next();
            
            for (int nt = 0; nt < 4; nt++) {
                System.out.print("Digite a " + (nt + 1) + "° Nota do(a) " + nomes[n] + ": ");
                notas[n][nt] = s.nextDouble();
            }
        }
        
        System.out.println("\n");
        
        double maiorMedia = 0;
        double menorMedia = 10;
        String nomeMaiorMedia = "";
        String nomeMenorMedia = "";
        
        for (int n = 0; n < 3; n++) {
            double soma = 0;
            
            for (int nt = 0; nt < 4; nt++) {
                soma += notas[n][nt];
            }
            
            double media = soma / 4;
            
            System.out.println("Aluno: "+nomes[n] + " | Media: " + media);
            
            if (media > maiorMedia) {
                maiorMedia = media;
                nomeMaiorMedia = nomes[n];
            }
            
            if (media < menorMedia) {
                menorMedia = media;
                nomeMenorMedia = nomes[n];
            }
        }
        
        System.out.println("Maior Media: " + nomeMaiorMedia);
        System.out.println("Menor Media " + nomeMenorMedia);
        
        s.close();

	}

}
