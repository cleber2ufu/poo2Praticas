package br.ufu.poo2.gamepoo2.personagem;

import br.ufu.poo2.gamepoo2.personagem.acao.atacar.AtacarForte;
import br.ufu.poo2.gamepoo2.personagem.acao.correr.CorrerMedio;
import br.ufu.poo2.gamepoo2.personagem.acao.pular.PularMedio;

public class PersonagemTipo1 extends Personagem {

	public PersonagemTipo1() {
		
		super(new PularMedio(), new CorrerMedio(), new AtacarForte());
		
	}

}
