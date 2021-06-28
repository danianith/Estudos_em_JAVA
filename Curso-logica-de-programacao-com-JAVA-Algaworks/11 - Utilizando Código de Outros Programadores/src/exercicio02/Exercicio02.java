// Sua tarefa agora é pegar a classe CalcularValorTroco do capítulo 2 e utilizar a nossa biblioteca AlgaWorksConsole ao invés da classe Scanner diretamente.

package exercicio02;

import console.Interacao;

public class Exercicio02 {

	public static void main(String[] args) {
		Interacao interacao = new Interacao();
		
		Double valorProduto = interacao.lerDecimal("Digite o valor do produto: ");;
		
		Double valorPassadoPeloCliente = interacao.lerDecimal("Digite quantidade passada pelo cliente: ");;
		
		Double resultado = valorPassadoPeloCliente - valorProduto;
		
		interacao.imprimir("Troco: " + resultado);
		
		interacao.fechar();
	}

}
