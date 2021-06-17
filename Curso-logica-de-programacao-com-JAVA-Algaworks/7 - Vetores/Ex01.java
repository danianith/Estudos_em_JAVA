// Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes do dia dele. 
// Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.


import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] tarefas = new String[5];
		
		for(int i = 0; i < tarefas.length; i++) {
			System.out.print("Tarefa " + i + ": ");
			tarefas[i] = scanner.nextLine();
		}
		
		
		System.out.println("Suas tarefas são: ");
		for(int i = 0; i < tarefas.length; i++) {
			System.out.println(i + ": " + tarefas[i]);
		}
		
		scanner.close();
	}

}