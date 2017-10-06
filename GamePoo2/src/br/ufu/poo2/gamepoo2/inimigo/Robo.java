package br.ufu.poo2.gamepoo2.inimigo;

import br.ufu.poo2.gamepoo2.util.Coordenadas;

public class Robo extends Inimigo {

	public Robo(String nome) {
		this.nome = nome;
		this.minhaPosicao = new Coordenadas(15,5);
	}
}
