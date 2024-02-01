package Entidades;

import java.util.ArrayList;

public class Questoes {
	private String enunciado;
	private String opcaoA;
	private String opcaoB;
	private String opcaoC;
	private String opcaoD;
	private String opcaoCerta;
	
	public Questoes() {
		super();
	}


	public Questoes(String enunciado, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String opcaoCerta) {
		super();
		this.enunciado = enunciado;
		this.opcaoA = opcaoA;
		this.opcaoB = opcaoB;
		this.opcaoC = opcaoC;
		this.opcaoD = opcaoD;
		this.opcaoCerta = opcaoCerta;
	}
	

	public String getEnunciado() {
		return enunciado;
	}


	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}


	public String getOpcaoA() {
		return opcaoA;
	}


	public void setOpcaoA(String opcaoA) {
		this.opcaoA = opcaoA;
	}


	public String getOpcaoB() {
		return opcaoB;
	}


	public void setOpcaoB(String opcaoB) {
		this.opcaoB = opcaoB;
	}


	public String getOpcaoC() {
		return opcaoC;
	}


	public void setOpcaoC(String opcaoC) {
		this.opcaoC = opcaoC;
	}


	public String getOpcaoD() {
		return opcaoD;
	}


	public void setOpcaoD(String opcaoD) {
		this.opcaoD = opcaoD;
	}


	public String getOpcaoCerta() {
		return opcaoCerta;
	}


	public void setOpcaoCerta(String opcaoCerta) {
		this.opcaoCerta = opcaoCerta;
	}


	public void cadastroQuestoes(ArrayList<Questoes> listaDeQuestoes) {
			
		listaDeQuestoes.add(new Questoes("Em que estado brasileiro nasceu a apresentadora Xuxa?",
										 "Rio de Janeiro",
										 "Rio Grande do Sul",
										 "Santa Catarina",
										 "Goiás",
										 "B"));
		
	listaDeQuestoes.add(new Questoes("Qual era o apelido da cantora Elis Regina?",
									 "Gauchinha",
									 "Paulistinha",
									 "Pimentinha",
									 "Andorinha",
									 "C"));
	
	listaDeQuestoes.add(new Questoes("Quem é a namorada do Mickey?",
			 "Margarida",
			 "Minnie",
			 "A Pequena Sereia",
			 "Olivia Palito",
			 "B"));
	
	listaDeQuestoes.add(new Questoes("Qual é o personagem do folclore brasileiro que tem uma perna só?",
			 "Cuca",
			 "Negrinho do Pastoreiro",
			 "Boitatá",
			 "Saci-pererê",
			 "D"));
	
	listaDeQuestoes.add(new Questoes("Quantos jogadores um jogo de vôlei reúne na quadra?",
			 "6",
			 "8",
			 "10",
			 "12",
			 "D"));
	
	
	listaDeQuestoes.add(new Questoes("Qual é o país do tango?",
			 "Uruguai",
			 "Argentina",
			 "Paraguai",
			 "Espanha",
			 "B"));
	
	
	listaDeQuestoes.add(new Questoes("O que é um oboé?",
			 "Vulcão",
			 "Comida",
			 "Instrumento",
			 "Tribo indígena",
			 "C"));
	
	listaDeQuestoes.add(new Questoes("O que é gôndola?",
			 "Embarcação",
			 "Brinquedo",
			 "Música",
			 "Símbolo",
			 "A"));
		
	listaDeQuestoes.add(new Questoes("Peroba é uma espécie de?",
			 "Inseto",
			 "Árvore",
			 "Verme",
			 "Verdura",
			 "B"));

	listaDeQuestoes.add(new Questoes("O que os filatelistas colecionam?",
			 "Quadros",
			 "Moedas",
			 "Selos",
			 "Figurinhas",
			 "C"));
		
	listaDeQuestoes.add(new Questoes("O que é palato?",
			 "Barriga da perna",
			 "Menina dos olhos",
			 "Língua",
			 "Céu da boca",
			 "D"));	
						
	}
	
	public void mostraQuestoes(Questoes[] arrayDeQuestoes) {
		int i = 0;
		for (Questoes q : arrayDeQuestoes) {
			i++;
			System.out.println("Questão " + i + ": ");
			System.out.println(q.getEnunciado());
			System.out.println("Alternativas:");
			System.out.println("A. " + q.getOpcaoA());
			System.out.println("B. " + q.getOpcaoB());
			System.out.println("C. " + q.getOpcaoC());
			System.out.println("D. " + q.getOpcaoD());
			System.out.println("Insira a resposta:");
			/*
			String resp = sc.nextLine();
			
			if (resp.equals(q.getOpcaoCerta())) {
				System.out.println("Parabéns! Você acertou!");
			} else {
				System.out.println("Infelizmente você errou.");
			}
			
			*/
			
		}		
			
	}
}
