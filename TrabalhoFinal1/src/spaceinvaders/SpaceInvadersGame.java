package spaceinvaders;

import java.awt.EventQueue;

import spriteframework.AbstractBoard;
import spriteframework.MainFrame;

public class SpaceInvadersGame extends MainFrame {
	private static final long serialVersionUID = 1L;

	public SpaceInvadersGame () {
		super("Space Invaders");
	}
	
	protected  AbstractBoard createBoard() {
		return new SpaceInvadersBoard();
	}

	public static void comecar() {
		EventQueue.invokeLater((Runnable) new SpaceInvadersGame());
	}

}
