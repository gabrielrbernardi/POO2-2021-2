package spaceinvaders;

import javax.swing.ImageIcon;

//prepara o ambiente do game
public class MonsterInvadersFactory {
    private int width;
	
	public void factory() {
		//cria a tela do game

		//cria o player do game
		
		//faz a criacoa dos monstros que aparecerao na tela
		ImageIcon ii = new ImageIcon(this.getClass().getResource("/images/woody.png"));
        width = ii.getImage().getWidth(null);
	}
}
