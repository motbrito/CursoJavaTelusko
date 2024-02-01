package Aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Questoes;

public class Principal 
{
	public static void main(String[] args) 
	{
		int i = 0;
		
		int desempenho = 1;
		
		int premio = 1000;
		
		String resp;
		
			
		Scanner sc = new Scanner(System.in);
		
		Questoes q1 = new Questoes();
	
		ArrayList<Questoes> listaDeQuestoes = new ArrayList<>();
		
		q1.cadastroQuestoes(listaDeQuestoes);
		
		
		do 
		{
			for (Questoes q : listaDeQuestoes) 
			{
				i++;
				System.out.println("Questão " + i + ": ");
				System.out.println(q.getEnunciado());
				System.out.println("Alternativas:");
				System.out.println("A. " + q.getOpcaoA());
				System.out.println("B. " + q.getOpcaoB());
				System.out.println("C. " + q.getOpcaoC());
				System.out.println("D. " + q.getOpcaoD());
				System.out.println("Insira a resposta:");
				resp = sc.nextLine();
				
				if (resp.equals(q.getOpcaoCerta())) 
				{
					System.out.println("Parabéns! Você acertou e está com R$" + premio + "!");
					premio *= 2;
				} else 
				
				{
					System.out.println("Infelizmente você errou e o jogo se encerra aqui.");
					desempenho=0;
					 break;
			
				}
				
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("-----------------------------------------------");
			}	
		}
		while (desempenho > 0);
	
	
		sc.close();	
	}
}

