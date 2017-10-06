package br.ufu.poo2.gamepoo2.inimigo;

import br.ufu.poo2.gamepoo2.util.Coordenadas;

public class Monstro extends Inimigo {
	
	public Monstro(String nome) {
		this.nome = nome;
		this.minhaPosicao = new Coordenadas(13,13);
	}

}
