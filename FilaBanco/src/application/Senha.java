package application;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Senha {
	private char tipo;
	private int numero;

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Senha(char tipo, int numero) {
		this.tipo = tipo;
		this.numero = numero;
	}

	public Senha() {
		this.numero = 0;
		this.tipo = ' ';
	}

	@Override
	public String toString() {
		return tipo + " - " + numero;
	}

}
