package Gabriel;

import java.util.Scanner;

public class repeticao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0,media=0,multiplo=0,soma=0;
		
		Scanner leia = new Scanner (System.in);
		
		do {
		
			System.out.println("\nEscreva  um numero: ");
			x = leia.nextInt();
			
			if(x % 3==0) {
				
				soma=soma+x;
				
				multiplo++;
			}
		}while(x!=0);
		
		media=soma/multiplo;
		
		System.out.println("\nA media dos numeros digitados de 3: é:"+media);
		System.out.println("\nQuantidade de numeros multiplos:"+multiplo);
			
	

}
}
