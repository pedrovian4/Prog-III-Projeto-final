package Main;

import javax.print.event.PrintEvent;
import javax.swing.JFrame;

import Entity.Player;

public class Game {

	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Conto do Dragão");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
			
	}
	
}
