package Arrays;

import java.util.Scanner;

public class Ex2ArrayVetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] vetor = new int[10];
		int impares = 0, pares = 0, soma = 0;
		float media;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("\n Digite um número: ");
			vetor[i] = leia.nextInt();
			soma += vetor[i];
		}

		System.out.println("Elementos nos índices ímpares: ");

		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 != 0) {
				impares = vetor[i];
				System.out.print(impares + " ");
			}
		}

		System.out.println("\nElementos pares: ");

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				pares = vetor[i];
				System.out.print(pares + " ");
			}

		}

		System.out.println("Soma: " + soma);

		media = (float) soma / vetor.length;
		System.out.printf("Média: %.2f", media);

	}

}
