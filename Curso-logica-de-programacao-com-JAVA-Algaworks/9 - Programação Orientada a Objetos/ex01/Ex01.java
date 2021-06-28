// Crie um programa que contenha um método que verifique a necessidade de repor o estoque de determinado produto em uma loja qualquer. 
// Considere que a quantidade mínima de um produto deva ser 10. Se o estoque for menor que isso, então ele retornará *true*, 
// pois, será necessária a reposição do estoque, caso contrário, ele retornará false.
// No final, você vai exibir, no console, se é necessária a reposição ou não.

package ex01;

public class Ex01 {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Notebook XZ10";
		produto.quantidadeEstoque = 8;
		
		System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + eNecessarioReporEstoque(produto));
	}
	
	static Boolean eNecessarioReporEstoque(Produto produto) {
		if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		}
		
		return false;
	}
}
