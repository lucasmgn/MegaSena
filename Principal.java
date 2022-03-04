package classeMath;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a sua quantidade de jogos: ");
		int quantidadeJogos = input.nextInt();
		
		int[][] n = new int[quantidadeJogos][6];
		
		for(int linha = 0; linha < n.length; linha++) {
			System.out.println("\nJogo:");
			for(int coluna = 0; coluna < n[linha].length; coluna++) {
				int numero = (int) Math.ceil(Math.random() * 60);
				//System.out.println(numero);
				n[linha][coluna] = numero;
				System.out.println(n[linha][coluna] + "");
			}
		}
	}
}
