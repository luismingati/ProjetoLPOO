package jogoInterfaceGrafica;

import javax.swing.JFrame;

public class Jogo extends JFrame{
	
	public Jogo() {
		setTitle("Ligue 4");
		setSize(900, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Jogo();
	}
	
}
