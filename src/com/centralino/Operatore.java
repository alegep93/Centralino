package com.centralino;

public class Operatore implements Runnable {
	private Cliente cServito;
	private Main m;
	
	public Operatore(Cliente cServito, Main m){
		this.cServito = cServito;
		this.m = m;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub	
	}
}
