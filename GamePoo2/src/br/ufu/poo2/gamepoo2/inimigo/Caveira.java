package br.ufu.poo2.gamepoo2.inimigo;

import br.ufu.poo2.gamepoo2.util.Coordenadas;

public class Caveira extends Inimigo {
	
	public Caveira(String nome) {
		this.nome = nome;
		this.minhaPosicao = new Coordenadas(10,10);
	}

}
