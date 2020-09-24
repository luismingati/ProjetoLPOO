package ligue4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int x;

	Jogador jogador1 = new Jogador("Jogador 1");
	Jogador jogador2 = new Jogador("Jogador 2");
	Partida ligue4 = new Partida(jogador1, jogador2);
	
	for(int n =0; n<42; n++) {
		x = input.nextInt();
		ligue4.fazerJogada(x);
		Jogador.jogadorVal++;
	}
	
	}	
}
