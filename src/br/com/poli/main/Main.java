package br.com.poli.main;


import java.awt.event.WindowListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import br.com.poli.ligue4.Partida;

/*
 * Alunos:  Daniel Salgueiro Lima
 * 			Luis Otavio C. Mingati		
 */



public class Main {
	

	
	public static void main(String[] args) {
	JFrame t = new JFrame();
	t.setTitle("Ligue 4");
	t.setSize(700,400);
	t.setLocation(340,200);
	t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	t.setVisible(true);
	
	int x, jogaVal;
	String nome1, nome2;
	
	nome1 = JOptionPane.showInputDialog(t, "Jogador 1, escreva seu nome: ");
	nome2 = JOptionPane.showInputDialog(t, "Jogador 2, escreva seu nome: ");
	Partida ligue4 = new Partida(nome1, nome2);
	JOptionPane.showMessageDialog(t, ligue4.getTabuleiro().toString());
	JOptionPane.showMessageDialog(t, ligue4.getJoga1().toString());
	JOptionPane.showMessageDialog(t, ligue4.getJoga2().toString());
	JOptionPane.showMessageDialog(t, ligue4.getJoga1().getNome()+ " faça sua jogada.");

	for(int n =0; n<=500; n++) {
		x = Integer.parseInt(JOptionPane.showInputDialog(t, "informe sua jogada "));
		
		if(n%2==0) {
			if(ligue4.getTabuleiro().validaJogada(x) == x) {
				if(ligue4.getTabuleiro().validaJogadaColuna(x) == x) {
			jogaVal =1;	
			ligue4.fazerJogada(x,jogaVal);
			if (ligue4.isVencedor()==true) {
				JOptionPane.showMessageDialog(t, ligue4.getJoga1().getNome()+ " ganhou!!!");
				break;
			}
			if(ligue4.isGameOver()==true) {
				JOptionPane.showMessageDialog(t, "Empate!");
				break;
			}
			JOptionPane.showMessageDialog(t, ligue4.getTabuleiro().toString());
			JOptionPane.showMessageDialog(t, "Jogador "+ligue4.getJoga1().getNome()+" fez a jogada: "+x);
			JOptionPane.showMessageDialog(t, ligue4.getJoga2().getNome()+ " faça sua jogada.");
		}	
				else {
					JOptionPane.showMessageDialog(t, ligue4.getTabuleiro().validaJogadaColuna(x));
				}
			}
			else {
				JOptionPane.showMessageDialog(t, ligue4.getTabuleiro().validaJogada(x));	
				n++;
			}
			}
		else {
			if(ligue4.getTabuleiro().validaJogada(x) == x) {
				if(ligue4.getTabuleiro().validaJogadaColuna(x) == x) {
			jogaVal =2;
			ligue4.fazerJogada(x,jogaVal);
			if (ligue4.isVencedor() ==true) {
				JOptionPane.showMessageDialog(t, ligue4.getJoga2().getNome() + " ganhou!!!");
				break;
			}
			if(ligue4.isGameOver()==true) {
				JOptionPane.showMessageDialog(t, "Empate!");
				break;
			}
			JOptionPane.showMessageDialog(t, ligue4.getTabuleiro().toString());
			JOptionPane.showMessageDialog(t, "Jogador "+ligue4.getJoga2().getNome()+" fez a jogada: "+x);
			JOptionPane.showMessageDialog(t, ligue4.getJoga1().getNome()+ " faça sua jogada.");
		}	
			else {
				JOptionPane.showMessageDialog(t, ligue4.getTabuleiro().validaJogadaColuna(x));
				}
		}
			else {
				JOptionPane.showMessageDialog(t, ligue4.getTabuleiro().validaJogada(x));
				n++;
		}
			}
				}
	
	
	}	
}
