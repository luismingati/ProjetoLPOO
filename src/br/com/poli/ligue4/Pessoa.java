package br.com.poli.ligue4;

public class Pessoa {

		private String nome;
		
		public Pessoa (String nome) {
			this.nome = nome;
		}
		public String toString() {
			return " nome do jogador �"+ this.nome;
		}
			
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
}
