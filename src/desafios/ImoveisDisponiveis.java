//Desafio  intermediário
//O seu amigo quer verificar quais os imóveis estão disponíveis em uma certa corretora na região onde ele mora. 
//A corretora disponibilizou uma API para ele, mas como ele não entende nada de programação, pediu a sua ajuda. 
//Para deixar tudo bonitinho, você resolveu criar um aplicativo para seu querido amigo, mas quando foi olhar a 
//API retornava os dados de uma forma esquisita, separado por barras. Ajude seu amigo deixando a informação mais 
//amigável possível.
//Entrada
//A entrada será a classificação do imóvel, o valor do aluguel dele e se ele está disponível no momento.
//Saída
//A saída deverá ser as informações da entrada, porém de uma forma mais amigável. (sem as aspas)

package desafios;

import java.util.Scanner;

public class ImoveisDisponiveis {
	public static void main(String[] args) {
		// A linha abaixo deve ser omitida para o código funcionar na plataforma.
		System.out.println("Entre a frase para formatação(os ítens devem ser separados por /):");
		Scanner leitor = new Scanner(System.in);
		String frase = leitor.next();

		String[] array = frase.split("/");

		System.out.print("Imovel: " + array[0] + " R$" + array[1] + " " + array[2]);
		leitor.close();
	}
}