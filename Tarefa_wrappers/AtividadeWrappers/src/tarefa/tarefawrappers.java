package tarefa;

import java.util.Scanner;

public class tarefawrappers {
	
	 public static void main(String[] args) {
	        // Criação do objeto Scanner para ler a entrada do console
	        Scanner scanner = new Scanner(System.in);
	        
	        // Lê um valor numérico do console
	        System.out.print("Digite um valor numérico: ");
	        int valorPrimitivo = scanner.nextInt();
	        
	        // Converte o valor primitivo para o tipo Wrapper
	        Integer valorWrapper = Integer.valueOf(valorPrimitivo);
	        
	        // Imprime o valor primitivo e o valor Wrapper no console
	        System.out.println("Valor primitivo: " + valorPrimitivo);
	        System.out.println("Valor Wrapper: " + valorWrapper);
	        
	        // Fecha o Scanner
	        scanner.close();
	    }
}
