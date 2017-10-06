package br.ufu.poo2.gamepoo2.inimigo;

import br.ufu.poo2.gamepoo2.util.Coordenadas;

public abstract class Inimigo{

	protected Coordenadas minhaPosicao;
	protected Coordenadas alvoPosicao;
	
	protected String nome;
	
	protected double calcularDistanciaAlvo() {
		double dist = Math.pow(minhaPosicao.x - alvoPosicao.x, 2);
		dist = dist + Math.pow(minhaPosicao.y - alvoPosicao.y, 2);
		dist = Math.sqrt(dist);
		return dist;
	}
	
	public void updateXY(Coordenadas alvo) {
		this.alvoPosicao = alvo;
		Double distAlvo = this.calcularDistanciaAlvo();
		System.out.println(this.nome + " está a distância de " + distAlvo);
	}

}
