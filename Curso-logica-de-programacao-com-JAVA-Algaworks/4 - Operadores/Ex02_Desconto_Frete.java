// Crie um programa que receba o valor de um produto e exiba o valor final da compra. 
// Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00. 
// Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
// Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.

import java.util.Scanner;
public class Ex02_Desconto_Frete {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Valor do produto: ");
			Double valorProduto = scanner.nextDouble();
			
			Boolean precisaCobrarFrete = valorProduto < 100;
			
			Double valorFinal = valorProduto;
			
			if (precisaCobrarFrete) {
				valorFinal += 15.0;
			}
			
			System.out.println("Valor final: " + valorFinal);
			
			
			scanner.close();

		}
	}
