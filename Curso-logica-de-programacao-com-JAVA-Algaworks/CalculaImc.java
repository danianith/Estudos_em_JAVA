import java.util.Scanner;

public class CalculaImc {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CALCULADORA DO ÍNDICE DE MASSA CORPORAL (IMC)");
		
		System.out.print("Digite seu peso (em Kg): ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite sua altura (em metros): ");
		Double altura = scanner.nextDouble();
		
		Double alturaAoQuadrado = altura * altura;
		
		Double indiceMassaCorporal = peso / alturaAoQuadrado;
		
		System.out.println("Seu IMC é: " + indiceMassaCorporal);
		
		scanner.close();
	}
}
