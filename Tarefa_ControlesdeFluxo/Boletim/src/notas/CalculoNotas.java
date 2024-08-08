package notas;

import java.util.Scanner;

public class CalculoNotas {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo as 4 notas do aluno
        double[] notas = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calculando a média
        double soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += notas[i];
        }
        double media = soma / 4;

        // Validando a média
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Aluno de recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
