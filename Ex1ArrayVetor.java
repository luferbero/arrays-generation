package Arrays;

import java.util.Scanner;

public class Ex1ArrayVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [] vetor = {2,5,1,3,4,9,7,8,10,6};
		int num, busca=-1;
		
		System.out.println("\n| 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 |");
		System.out.println("\n Escolha um número: ");
		num = leia.nextInt();
		
		for(int x=0; x<10; x++) {
			if(num == vetor[x]) {
				busca = x;
			}
		}
		
		if(busca==-1) {
			System.out.printf("O número %d não foi encontrado!",num);
		} else {
			System.out.printf("O número %d está localizado na posição: %d",num,busca);
		}
		

	}

}
