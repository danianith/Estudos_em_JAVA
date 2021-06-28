// Crie um programa que faça o mesmo que o exercício 1 do capítulo 10, mas, ao invés de salvar as atividades no arquivo, envie as atividades por e-mail.
// Uma dica aqui na hora do envio da lista de tarefas por e-mail é colocar cada tarefa em uma linha. Você pode fazer isso utilizando utilizando o código que diz onde a linha termina. Esse código é o "\n".
// Toda vez que o código "\n" é encontrado em uma *string* é feita uma quebra de linha na hora de apresentar a informação.
// Supondo que você tem uma lista com algumas tarefas, você pode fazer assim:
// String tarefas = "";
//for (int iteracao = 0; iteracao < listaComAsTarefas.size(); iteracao++) {
	//tarefas += listaComAsTarefas.get(iteracao) + "\\n"; // Repare aqui a quebra de linha.
//}

//String mensagem = "Suas tarefas: \\n" + tarefas; // Aqui também tem uma quebra de linha. Essa é a variável que vai ser enviada como o texto do e-mail.

// Faça testes com e sem o código de quebra de linha para perceber a diferença visualmente.


package exercicio01;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.mail.EmailException;

import console.Interacao;

public class Exercicio01 {

	public static void main(String[] args) throws IOException, EmailException {
		Interacao interacao = new Interacao();

		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		int i = 0;
		while (true) { // Deixei o true como condição do laço, pois, o que vai pará-lo é o fato do usuário digitar o "x" no console.
			tarefa = interacao.lerLinha("Tarefa " + i + ": ");
			
			if ("x".equals(tarefa)) {
				break; // Essa é a única maneira de parar esse laço.
			}

			linhas.add(tarefa);
			i++;
		}

		String tarefas = "";
		
		for (int iteracao = 0; iteracao < linhas.size(); iteracao++) {
			tarefas += linhas.get(iteracao) + "\n"; 
		}
		
		String mensagem = "Suas tarefas: \n" + tarefas;

		String para = interacao.lerLinha("Digite seu e-mail: "); 
				
		Carteiro.enviar(para, "Sua lista de tarefas", mensagem);
		
		interacao.imprimir("Fim...");
		
		interacao.fechar();
	}
}
