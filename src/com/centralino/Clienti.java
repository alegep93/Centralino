package com.centralino;

import java.util.Date;

public class Clienti implements Runnable{
	String nome;
	Date arrivo, accettazione;
	
	public Clienti(String n, Date arr){
		this.nome = n;
		this.arrivo = arr;
	}

	@Override
	public void run() {		
	}
}
