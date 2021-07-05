package Gabriel;

import java.util.Scanner;

public class repeticao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade,identgenero,fatorpsico,x=1;
		int contpc=0,contmn=0,contha=0,contpn40=0,contpc18=0,contoc=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(x<=5)
		{
			System.out.println("\nEntre com a sua idade:");
			idade = leia.nextInt();
			System.out.println("\nEntre com a sua identidade de genero -- 1- feminino");
			identgenero = leia.nextInt();
			System.out.println("\nEntre com o fator psicologico -- 1-calma 2-Nervosa");
			fatorpsico = leia.nextInt();
			
			if(fatorpsico == 1)
			{
				contpc++;
			}
			if(identgenero==1 && fatorpsico==2)
			{
				contmn++;
			}
			if(identgenero==2 && fatorpsico==3)
			{
				contha++;
			}
			if(identgenero==3 && fatorpsico==1)
			{
				contoc++;
			}
			if(fatorpsico==2 && idade>40)
			{
				contpn40++;
			}
			if(fatorpsico==1 && idade<18)
			{
				contpc18++;
			}
			x++;
		}
		
		System.out.println("\nPessoas calmas: "+contpc);
		System.out.println("Mulheres nervosas: "+contmn);
		System.out.println("\nHomens agressivos: "+contha);
		System.out.println("\nOutros calmas: "+contoc);
		System.out.println("\nPessoas nervosas acima e 40 anos: "+contpn40);
		System.out.println("\nPessoas calmas com menos de 18 anos: "+contpc18);
		
	}

}
