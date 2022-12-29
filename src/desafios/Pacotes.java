//Desafio
//Você foi contratado para criar um gerenciador de pacotes. Porém, 
//o que restou para você fazer foi o contador de porcentagem de download dos pacotes. 
//Mas como o espaço para essa informação ficou pequeno, a empresa optou por fazer uma escala de 10 – 1. 
//Então a escala será 1 = 10%, 2 = 20%, 3 = 30% e etc.
//Para cada 10% de download, o programa deve printar, em sequência e sem espaços, uma barra “/”.
//Entrada
//A entrada será um número que representará a porcentagem
//Saída
//A saída serão as barras sem espaços entre elas. 

package desafios;

import java.util.Scanner;

public class Pacotes {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		//A linha abaixo deve ser omitida para o código funcionar na plataforma.
		System.out.println("Entre com um número para representar o percentual em /: ");
		int tamanho = leitor.nextInt();
		
		//A linha abaixo deve ser omitida para o código funcionar na plataforma.
		System.out.print("O percentual em barras é");
		for (int i = 0; i < tamanho; i++) {
			System.out.print("/");
		}
	//A linha abaixo deve ser omitida para o código funcionar na plataforma.
	System.out.println("%");
	leitor.close();
	}
}
