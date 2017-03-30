package com.centralino;

public class ControlloreOperatori {
	private static int opOccupati = 0;
	private static int numMaxOperatori = 5; 
	
	public synchronized void serviClienti(Cliente c) throws InterruptedException {
		if(opOccupati >= numMaxOperatori){
			wait();
		}
		
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
