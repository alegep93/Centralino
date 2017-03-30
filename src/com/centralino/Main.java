package com.centralino;

import java.util.Date;

public class Main {
	private static int opOccupati = 0;
	private static int maxOpOccupati = 5; 
	
	public static void main(String[] args) throws InterruptedException {
		Cliente[] cArray = new Cliente[100];
		Thread[] t = new Thread[5];
		int numOperatori = 5;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i] = new Cliente("Cliente " + i, new Date());
		}
		
		for (Cliente c : cArray){
			serve(c);
		}
	}
	
	public void serve(Cliente c){
		if(opOccupati >= maxOpOccupati)
			wait();
		
		IncrementaOpOccupati();
		Operatore op = new Operatore(c, this);
		Thread t = new Thread(op);
		t.start();
	}

	public synchronized static void IncrementaOpOccupati(){
		opOccupati++;
	}
	public synchronized void DecrementaOpOccupati(){
		opOccupati--;
		notify();
	}
}
