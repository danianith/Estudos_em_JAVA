import java.util.Scanner;

public class Ex05 {
	
	static final Integer NOTA_MINIMA_APROVACAO = 70;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua nota: ");
		Double notaAluno = scanner.nextDouble();
		
		Boolean aprovado = notaAluno >= NOTA_MINIMA_APROVACAO;
		
		if (aprovado) {
			System.out.println("Parabéns! Você passou de ano ^^");
		} else {
			System.out.println("Infelizmente, está de recuperação.");
		}
		
		scanner.close();
	}
}