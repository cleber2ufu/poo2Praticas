package br.ufu.poo2.gamepoo2.personagem;


import java.util.ArrayList;
import java.util.List;

import br.ufu.poo2.gamepoo2.inimigo.Inimigo;
import br.ufu.poo2.gamepoo2.personagem.acao.atacar.IAtacar;
import br.ufu.poo2.gamepoo2.personagem.acao.correr.ICorrer;
import br.ufu.poo2.gamepoo2.personagem.acao.pular.IPular;
import br.ufu.poo2.gamepoo2.personagem.alvo.IAlvo;
import br.ufu.poo2.gamepoo2.util.Coordenadas;

public abstract class Personagem implements IAlvo{
	
	private IPular pulo;
	private ICorrer movimento;
	private IAtacar ataque;
	
	private Coordenadas minhaPosicao = new Coordenadas(25, 25);
	
	private List<Inimigo> inimigos = new ArrayList<Inimigo>();
	
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
	
	public void setPosicao(int x, int y) {
		this.minhaPosicao.x = x;
		this.minhaPosicao.y = y;
		this.updateXY();
	}
	
	//Padrão Observer -> Adicionando Observador
	@Override
	public void addInimigo(Inimigo inmg) {
		this.inimigos.add(inmg);		
	}

	//Padrão Observer -> Removendo Observador
	@Override
	public void delInimigo(Inimigo inmg) {
		this.inimigos.remove(inmg);		
	}

	//Padrão Observer -> notificando observadores 
	@Override
	public void updateXY() {
		for (Inimigo inimigo : inimigos) {
			inimigo.updateXY(this.minhaPosicao);
		}
		
	}	
	
	
} 
