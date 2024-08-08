package calculo;

import java.util.Scanner;

public class CalculaMedia {
	
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Leitura das quatro notas
		        System.out.println("Digite a primeira nota: ");
		        double nota1 = scanner.nextDouble();

		        System.out.println("Digite a segunda nota: ");
		        double nota2 = scanner.nextDouble();

		        System.out.println("Digite a terceira nota: ");
		        double nota3 = scanner.nextDouble();

		        System.out.println("Digite a quarta nota: ");
		        double nota4 = scanner.nextDouble();

		        // Cálculo da média
		        double media = (nota1 + nota2 + nota3 + nota4) / 4;

		        // Impressão da média no console
		        System.out.println("A média das quatro notas é: " + media);

		        scanner.close();
    }
}
