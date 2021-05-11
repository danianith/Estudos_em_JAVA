

import java.util.Scanner;

//resultado no console. Lembrando que o quadrado de um número é calculado multiplicando-se o número por ele mesmo. 
//Por exemplo, para encontrar o quadrado de 2 é preciso multiplicar o 2 por 2, tendo como resultado o número 4.

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		Integer numero = scanner.nextInt();
		
		Integer quadrado = numero * numero;
		
		System.out.println("O quadrado de " + numero + " é " + quadrado + ".");
		
		scanner.close();
	}

}
