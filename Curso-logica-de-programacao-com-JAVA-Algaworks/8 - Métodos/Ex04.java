// Crie um programa que receba um número qualquer do usuário e imprima a tabuada desse número, do 0 até o 10

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		Integer numero = scanner.nextInt();
		
		System.out.println("----------------------------------");
		
		imprimirTabuada(numero, 0);
		
		scanner.close();
	}
	
	static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));
		
		if (++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
	}

}