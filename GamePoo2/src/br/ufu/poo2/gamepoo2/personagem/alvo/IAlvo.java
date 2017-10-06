package br.ufu.poo2.gamepoo2.personagem.alvo;

import br.ufu.poo2.gamepoo2.inimigo.Inimigo;

public interface IAlvo {
	public void addInimigo(Inimigo inmg);
	public void delInimigo(Inimigo inmg);
	public void updateXY();	

}
