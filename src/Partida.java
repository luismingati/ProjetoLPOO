package ligue4;

public class Partida {
		
		
		Jogador joga1 = new Jogador("daniel");
		Jogador joga2 = new Jogador("daniel");	
		private boolean gameOver;
		private boolean vencedor;
		
		public Partida(Jogador jogador1, Jogador jogador2) {
			joga1 = jogador1;
			joga2 = jogador2;
					
		}
		public void gameOver() {
			int jogadas=0;
			if(jogadas == 42) {
				gameOver = true;
			}else {
				gameOver = false;
			}
			
		}
		
		public void fazerJogada(int x) {
			
			if (Jogador.jogadorVal%2 != 1) {
				System.out.println(joga1.getNome()+ " fez a jogada " +x);
			}
			else {
				System.out.println(joga2.getNome()+ " fez a jogada " +x);
			}
		}
	
}
