package com.centralino;

import java.util.Date;

public class Cliente implements Runnable{
	String nome;
	Date arrivo, accettazione;
	
	public Cliente(String n, Date arr){
		this.nome = n;
		this.arrivo = arr;
	}

	@Override
	public void run() {
	}
}
