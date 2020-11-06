package br.com.poli.ligue4;

public class Jogador extends Pessoa{
	

	private int jogaVal;
	
	public Jogador(String nome, int val) {
		super(nome);
		this.jogaVal = val;	
	}
	@Override
	public String toString() {
		return "("+this.jogaVal+")"+" O nome do jogador é "+ this.getNome();
	}
	public int getJogaVal() {
		return jogaVal;
	}
	public void setJogaVal(int jogaVal) {
		this.jogaVal = jogaVal;
	}		
}
	 
