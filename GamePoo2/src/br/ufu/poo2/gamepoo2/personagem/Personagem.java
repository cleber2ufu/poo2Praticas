package br.ufu.poo2.gamepoo2.personagem;

import br.ufu.poo2.gamepoo2.personagem.acao.atacar.IAtacar;
import br.ufu.poo2.gamepoo2.personagem.acao.correr.ICorrer;
import br.ufu.poo2.gamepoo2.personagem.acao.pular.IPular;

public abstract class Personagem {
	
	private IPular pulo;
	private ICorrer movimento;
	private IAtacar ataque;
	
	public Personagem(IPular pulo, ICorrer movimento, IAtacar ataque) {
		this.pulo = pulo;
		this.movimento = movimento;
		this.ataque = ataque;
	}
	
	public void pular() {
		this.pulo.pular();
	}
	
	public void correr() {
		 this.movimento.correr();
	}
	
	public void atacar() {
		this.ataque.atacar();
	}
} 
