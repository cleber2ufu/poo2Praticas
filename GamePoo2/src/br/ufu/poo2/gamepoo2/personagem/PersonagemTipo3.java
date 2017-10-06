package br.ufu.poo2.gamepoo2.personagem;

import br.ufu.poo2.gamepoo2.personagem.acao.atacar.AtacarForte;
import br.ufu.poo2.gamepoo2.personagem.acao.correr.CorrerRapido;
import br.ufu.poo2.gamepoo2.personagem.acao.pular.PularBaixo;

public class PersonagemTipo3 extends Personagem {
	
	public PersonagemTipo3() {
		super(new PularBaixo(), new CorrerRapido(), new AtacarForte());
	}

}
