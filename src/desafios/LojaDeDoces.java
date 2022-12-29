//Desafio básico
//Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola. 
//Para aumentar as vendas o dono resolveu colocar uma máquina onde os clientes, 
//principalmente as crianças que estão muito acostumadas com a tecnologia, 
//poderiam colocar suas moedas e receber dois doces aleatórios. Cada 1 real irá render 2 doces aleatórios.
//Entrada
//A entrada será a quantidade de dinheiro que cada cliente, um por vez, possui.
//Saída
//A saída deverá ser a quantidade de doces que cada cliente conseguiu obter. (sem as aspas)

package desafios;

import java.util.Scanner;

public class LojaDeDoces {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//A linha abaixo deve ser omitida para o código funcionar na plataforma.
		System.out.println("Entre com a quantia disponível para comprar doces:");
		int doce = leitor.nextInt();
		//A linha abaixo não deve ter o ponto final para o código funcionar na plataforma.
		System.out.println("O cliente obteve " + 2 * doce + " doces.");
		leitor.close();
	}
}