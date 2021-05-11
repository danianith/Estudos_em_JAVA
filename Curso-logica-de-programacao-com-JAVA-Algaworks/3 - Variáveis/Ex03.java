import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua nota: ");
		Double notaAluno = scanner.nextDouble();
		
		Boolean aprovado = notaAluno >= 70;
		
		if (aprovado) {
			System.out.println("Parabéns! Você passou de ano ^^");
		} else {
			System.out.println("Infelizmente, está de recuperação.");
		}
		
		scanner.close();
	}
}