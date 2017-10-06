package br.ufu.poo2.gamepoo2.teste;

import br.ufu.poo2.gamepoo2.personagem.PersonagemTipo1;
import br.ufu.poo2.gamepoo2.personagem.PersonagemTipo2;
import br.ufu.poo2.gamepoo2.personagem.PersonagemTipo3;

public class TesteMain {
	
	public static void main(String[] args) {
		PersonagemTipo1 joao = new PersonagemTipo1();
		PersonagemTipo2 maria = new PersonagemTipo2();
		PersonagemTipo3 pedro = new PersonagemTipo3();
		
		System.out.println("Ações de João:");
		joao.correr();
		joao.atacar();
		joao.pular();
		
		System.out.println("\nAções de Maria");
		maria.correr();
		maria.atacar();
		maria.pular();
		
		System.out.println("\nAções de Pedro");
		pedro.correr();
		pedro.atacar();
		pedro.pular();
		
	
		
	}

}
