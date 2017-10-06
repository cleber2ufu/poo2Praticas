package br.ufu.poo2.gamepoo2.teste;

import br.ufu.poo2.gamepoo2.inimigo.Caveira;
import br.ufu.poo2.gamepoo2.inimigo.Monstro;
import br.ufu.poo2.gamepoo2.inimigo.Robo;
import br.ufu.poo2.gamepoo2.personagem.PersonagemTipo1;
import br.ufu.poo2.gamepoo2.personagem.PersonagemTipo2;
import br.ufu.poo2.gamepoo2.personagem.PersonagemTipo3;

public class TesteMain {
	
	public static void main(String[] args) {
		PersonagemTipo1 joao = new PersonagemTipo1();
		PersonagemTipo2 maria = new PersonagemTipo2();
		PersonagemTipo3 pedro = new PersonagemTipo3();

		//Testes Strategy
		System.out.println("A��es de Jo�o:");
		joao.correr();
		joao.atacar();
		joao.pular();
		
		System.out.println("\nA��es de Maria");
		maria.correr();
		maria.atacar();
		maria.pular();
		
		System.out.println("\nA��es de Pedro");
		pedro.correr();
		pedro.atacar();
		pedro.pular();
		
	
		//Testes Observer
		Caveira ossao = new Caveira("Oss�o");
		Monstro carranca = new Monstro("Carranca");
		Robo cyborg = new Robo("Cyborg");
		
		//Monitorando o Personagem Tipo1 Jo�o
		joao.addInimigo(ossao);
		joao.addInimigo(carranca);
		joao.addInimigo(cyborg);
		
		joao.setPosicao(13, 21);
		
		joao.setPosicao(15, 28);
		
		joao.delInimigo(carranca);
		
		joao.setPosicao(34, 19);
		
		
		
	}

}
