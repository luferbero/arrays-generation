package Arrays;

import java.util.Scanner;

public class Ex4ArrayMatriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float [][] notas = new float [10] [4];
		float soma=0;
		
		float [] mediaAlunos = new float [10];
		
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 4; coluna++) {
				System.out.println("\nDigite as notas do "+(linha+1)+" aluno: ");
				notas[linha][coluna] = leia.nextFloat();
				soma += notas[linha][coluna];
				}
			
			mediaAlunos[linha] = soma / 4;
			soma = 0;
			
			}
		
		for (int i = 0; i < mediaAlunos.length; i++) {
			System.out.printf("\nMédia do aluno %d: %.1f",(i+1), mediaAlunos[i]);
		}

	}

}
