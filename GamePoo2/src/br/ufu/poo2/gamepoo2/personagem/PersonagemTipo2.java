package br.ufu.poo2.gamepoo2.personagem;

import br.ufu.poo2.gamepoo2.personagem.acao.atacar.AtacarMedio;
import br.ufu.poo2.gamepoo2.personagem.acao.correr.CorrerRapido;
import br.ufu.poo2.gamepoo2.personagem.acao.pular.PularAlto;

public class PersonagemTipo2 extends Personagem {
	
	public PersonagemTipo2() {
		super(new PularAlto(), new CorrerRapido(), new AtacarMedio());
	}

}
