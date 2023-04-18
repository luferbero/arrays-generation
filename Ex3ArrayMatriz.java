package Arrays;

import java.util.Scanner;

public class Ex3ArrayMatriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int linha, coluna, somadiagonalP = 0, somadiagonalS = 0;
		String DiagonalP = "", DiagonalS = "";

		for (linha = 0; linha < matriz.length; linha++) {
			for (coluna = 0; coluna < matriz.length; coluna++) {
				System.out.printf("\nDigite um número na posição [%d][%d]: ", linha, coluna);
				matriz[linha][coluna] = leia.nextInt();

				if (linha == coluna) {
					somadiagonalP += matriz[linha][coluna];
					DiagonalP += matriz[linha][coluna] + " ";
				}

				if (linha + coluna == 2) {
					somadiagonalS += matriz[linha][coluna];
					DiagonalS += matriz[linha][coluna] + " ";

				}
			}
		}

		System.out.println("\nElementos da diagonal pincipal: " + DiagonalP);
		System.out.println("\nElementos da diagonal secundária: " + DiagonalS);
		System.out.println("\nSomatório da diagonal pincipal: " + somadiagonalP);
		System.out.println("\nSomatório da diagonal secundária: " + somadiagonalS);

	}

}
